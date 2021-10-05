package com.star.forum.service;

import com.star.forum.dto.*;
import com.star.forum.enums.LikeTypeEnum;
import com.star.forum.mapper.TalkExtMapper;
import com.star.forum.mapper.TalkMapper;
import com.star.forum.model.Talk;
import com.star.forum.model.TalkExample;
import com.star.forum.util.TimeUtils;
import com.star.forum.vo.TalkVO;
import org.apache.commons.lang3.StringUtils;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * 聊天室板块
 *
 * @Author: zzStar
 * @Date: 12-06-2020 12:24
 */
@Service
public class TalkService {

    @Resource
    private TalkMapper talkMapper;
    @Resource
    private LikeService likeService;
    @Resource
    private TalkExtMapper talkExtMapper;
    @Resource
    private UserService userService;
    @Resource
    private UserAccountService userAccountService;
    @Resource
    private Environment env;
    @Resource
    private TimeUtils timeUtils;

    @Transactional
    public int insert(TalkDTO talkDTO) {
        Talk talk = new Talk();
        BeanUtils.copyProperties(talkDTO, talk);
        talk.setCreator(talkDTO.getUser().getId());
        return talkMapper.insertSelective(talk);
    }

    @Transactional
    public int deleteByPrimaryKey(Long id) {
        return talkMapper.deleteByPrimaryKey(id);
    }

    @Transactional
    public Talk updateExt(Talk talk, TalkDTO talkDTO) {
        if (talk == null) {
            talk = new Talk();
            BeanUtils.copyProperties(talkDTO, talk);
        }
        int i = talkExtMapper.updateByPrimaryKeySelective(talk);
        if (i > 0) return talkMapper.selectByPrimaryKey(talk.getId());
        return null;
    }

    @Transactional
    public Talk update(Talk talk, TalkDTO talkDTO) {
        if (talk == null) {
            talk = new Talk();
            BeanUtils.copyProperties(talkDTO, talk);
        }
        int i = talkMapper.updateByPrimaryKeySelective(talk);
        if (i > 0) return talkMapper.selectByPrimaryKey(talk.getId());
        return null;
    }


    public PaginationDTO list(TalkQueryDTO talkQueryDTO, UserDTO view_user) {
        Integer totalPage;
        Integer totalCount = talkExtMapper.count(talkQueryDTO);
        TalkExample talkExample = new TalkExample();
        TalkExample.Criteria criteria = talkExample.createCriteria();
        if (talkQueryDTO.getCreator() != null)
            criteria.andCreatorEqualTo(talkQueryDTO.getCreator());
        if (talkQueryDTO.getId() != null && (talkQueryDTO.getId().longValue() != 0L))
            criteria.andIdEqualTo(talkQueryDTO.getId());
        if (talkQueryDTO.getType() != null)
            criteria.andTypeEqualTo(talkQueryDTO.getType());

        if (totalCount % talkQueryDTO.getSize() == 0) {
            totalPage = totalCount / talkQueryDTO.getSize();
        } else {
            totalPage = totalCount / talkQueryDTO.getSize() + 1;
        }

        if (talkQueryDTO.getPage() > totalPage) {
            talkQueryDTO.setPage(totalPage);
        }

        Integer offset = talkQueryDTO.getPage() < 1 ? 0 : talkQueryDTO.getSize() * (talkQueryDTO.getPage() - 1);
        talkQueryDTO.setOffset(offset);

        talkExample.setOrderByClause(talkQueryDTO.getSort() + " " + talkQueryDTO.getOrder());
        List<Talk> talks = talkMapper.selectByExampleWithRowbounds(talkExample, new RowBounds(talkQueryDTO.getSize() * (talkQueryDTO.getPage() - 1), talkQueryDTO.getSize()));
        PaginationDTO paginationDTO = new PaginationDTO();
        paginationDTO.setTotalCount(totalCount);
        if (talks.size() == 0) {
            paginationDTO.setPage(0);
            paginationDTO.setTotalPage(0);
            paginationDTO.setData(new ArrayList<>());
            return paginationDTO;
        }

        List<TalkVO> talkVOs = new ArrayList<>();
        TalkVO talkVO;
        for (Talk talk : talks) {
            talkVO = new TalkVO();
            BeanUtils.copyProperties(talk, talkVO);
            UserDTO userDTO = userService.getUserDTO(talk.getCreator());
            talkVO.setUser(userDTO);
            talkVO = convert(talkVO, view_user);
            // talkVO.setGmtLatestCommentStr(timeUtils.getTime(talkVO.getGmtLatestComment(),null));
            //talkVO.setUserGroupStr(env.getProperty("user.group.r"+talkVO.getUser().getGroupId()));
            if (StringUtils.isNotBlank(talkVO.getImages())) {
                talkVO.setImageUrls(talkVO.getImages().split(","));
            }
            talkVOs.add(talkVO);
        }
        paginationDTO.setData(talkVOs);
        paginationDTO.setPagination(totalPage, talkQueryDTO.getPage());
        return paginationDTO;

    }


    public TalkVO convert(TalkVO talkVO, UserDTO view_user) {
        talkVO.setGmtLatestCommentStr(timeUtils.getTime(talkVO.getGmtLatestComment(), null));
        talkVO.setGmtModifiedStr(timeUtils.getTime(talkVO.getGmtModified(), null));
        talkVO.setUserGroupStr(env.getProperty("user.group.r" + talkVO.getUser().getGroupId()));
        talkVO.setEdited(talkVO.getGmtCreate().longValue() != talkVO.getGmtModified().longValue());
        if ((talkVO.getStatus() & 1) == 1) talkVO.setEssence(true);
        if ((talkVO.getStatus() & 2) == 2) talkVO.setSticky(true);
        if (view_user != null) {
            LikeQueryDTO likeQueryDTO = new LikeQueryDTO();
            likeQueryDTO.setTargetId(talkVO.getId());
            likeQueryDTO.setType(LikeTypeEnum.TALK.getType());
            likeQueryDTO.setLiker(view_user.getId());
            likeQueryDTO.convert();
            PaginationDTO paginationDTO = likeService.list(likeQueryDTO);
            if (paginationDTO.getTotalCount() == 1)
                talkVO.setFavorite(true);
            if (userAccountService.isAdminByUserId(view_user.getId())) {
                talkVO.setCanClassify(true);
                talkVO.setCanDelete(true);
                talkVO.setCanEssence(true);
                talkVO.setCanSticky(true);
                talkVO.setCanEdit(true);
                talkVO.setCanPromote(true);
            } else if (view_user.getId().longValue() == talkVO.getUser().getId().longValue()) {
                talkVO.setCanEdit(true);
                talkVO.setCanClassify(true);
                talkVO.setCanDelete(true);
            }
        }

        return talkVO;
    }


}
