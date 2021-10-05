package com.star.forum.api;

import com.star.forum.annotation.UserLoginToken;
import com.star.forum.dto.ThumbDTO;
import com.star.forum.dto.UserDTO;
import com.star.forum.service.LikeService;
import com.star.forum.vo.ThumbVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

/**
 * @Author: zzStar
 * @Date: 12-06-2020 17:01
 */
@Controller
@RequestMapping("/api/like")
@Api(tags = {"点赞/收藏接口"})
public class LikeApi {

    @Resource
    private LikeService likeService;

    @UserLoginToken
    @ApiOperation(value = "取消收藏", notes = "只有当作者登录后才能取消收藏")
    @DeleteMapping("/remove")
    @ResponseBody
    public Object removeLikeById(HttpServletRequest request
            , @RequestBody @Valid ThumbVO thumbVO
    ) {
        UserDTO userDTO = (UserDTO) request.getAttribute("loginUser");
        ThumbDTO thumbDTO = new ThumbDTO();
        BeanUtils.copyProperties(thumbVO, thumbDTO);
        thumbDTO.setUser(userDTO);
        return likeService.remove(thumbDTO);
        //return likeService.removeLikeByIdAndType(userDTO.getId(),thumbVO.getTargetId(),thumbVO.getType());
    }

    @UserLoginToken
    @ApiOperation(value = "新增收藏", notes = "只有当作者登录后才能收藏")
    @PostMapping("/insert")
    @ResponseBody
    public Object insert(HttpServletRequest request
            , @RequestBody @Valid ThumbVO thumbVO) {

        UserDTO user = (UserDTO) request.getAttribute("loginUser");
        ThumbDTO thumbDTO = new ThumbDTO();
        BeanUtils.copyProperties(thumbVO, thumbDTO);
        thumbDTO.setGmtCreate(System.currentTimeMillis());
        thumbDTO.setGmtModified(thumbDTO.getGmtCreate());
        thumbDTO.setUser(user);
        return likeService.insert(thumbDTO);
    }


}



