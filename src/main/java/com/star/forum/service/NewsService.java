package com.star.forum.service;

import com.star.forum.dto.NewsDTO;
import com.star.forum.dto.NewsQueryDTO;
import com.star.forum.dto.PaginationDTO;
import com.star.forum.enums.NewsColumnEnum;
import com.star.forum.enums.SortEnum;
import com.star.forum.exception.CustomizeErrorCode;
import com.star.forum.exception.CustomizeException;
import com.star.forum.mapper.NewsExtMapper;
import com.star.forum.mapper.NewsMapper;
import com.star.forum.model.News;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;

/**
 * 新闻板块
 *
 * @Author: zzStar
 * @Date: 12-09-2020 23:18
 */
@Service
public class NewsService {

    @Resource
    private NewsMapper newsMapper;
    @Resource
    private NewsExtMapper newsExtMapper;


    public NewsDTO getById(Long id) {
        News news = newsMapper.selectByPrimaryKey(id);
        if (news == null) {
            throw new CustomizeException(CustomizeErrorCode.NEWS_NOT_FOUND);
        }
        NewsDTO newsDTO = new NewsDTO();
        BeanUtils.copyProperties(news, newsDTO);
        newsDTO.setColumnStr(NewsColumnEnum.codeToName(news.getColumn2()));
        return newsDTO;
    }

    public void incView(Long id) {
        News news = new News();
        news.setNewsId(id);
        news.setViewCount(1);
        newsExtMapper.incView(news);

    }

    public PaginationDTO listAllNews(String search, String tag, String sort, Integer page, Integer size, Integer column2) {
        if (StringUtils.isNotBlank(search)) {
            String[] tags = StringUtils.split(search, " ");
            search = Arrays
                    .stream(tags)
                    .filter(StringUtils::isNotBlank)
                    .map(t -> t.replace("+", "").replace("*", "").replace("?", ""))
                    .filter(StringUtils::isNotBlank)
                    .collect(Collectors.joining("|"));
        }
        //
        Integer totalPage;
        NewsQueryDTO newsQueryDTO = new NewsQueryDTO();
        newsQueryDTO.setSearch(search);
        if (column2 != null) newsQueryDTO.setColumn2(column2);
        if (StringUtils.isNotBlank(tag)) {
            tag = tag.replace("+", "").replace("*", "").replace("?", "");
            newsQueryDTO.setTag(tag);
        }

        //  ColumnEnum columnEnum = ColumnEnum.

        for (SortEnum sortEnum : SortEnum.values()) {
            if (sortEnum.name().toLowerCase(Locale.ENGLISH).equals(sort)) {
                newsQueryDTO.setSort(sort);

                if (sortEnum == SortEnum.HOT7) {
                    newsQueryDTO.setTime(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 7);
                }
                if (sortEnum == SortEnum.HOT30) {
                    newsQueryDTO.setTime(System.currentTimeMillis() - 1000L * 60 * 60 * 24 * 30);
                }
                break;
            }
        }


        Integer totalCount = newsExtMapper.countBySearch(newsQueryDTO);
        if (totalCount % size == 0) {
            totalPage = totalCount / size;
        } else {
            totalPage = totalCount / size + 1;
        }
        if (page < 1) {
            page = 1;
        }
        if (page > totalPage) {
            page = totalPage;
        }

        Integer offset = page < 1 ? 0 : size * (page - 1);
        newsQueryDTO.setSize(size);
        newsQueryDTO.setOffset(offset);
        List<News> newsList = newsExtMapper.selectBySearch(newsQueryDTO);
        List<NewsDTO> newsDTOs = new ArrayList<>();
        NewsDTO newsDTO;
        for (News news : newsList) {
            newsDTO = new NewsDTO();
            BeanUtils.copyProperties(news, newsDTO);
            newsDTO.setColumnStr(NewsColumnEnum.codeToName(newsDTO.getColumn2()));
            newsDTOs.add(newsDTO);
            newsDTO = null;
        }
        //List<NewsDTO> questionDTOList = new ArrayList<>();
        PaginationDTO paginationDTO = new PaginationDTO();
        paginationDTO.setData(newsDTOs);


        paginationDTO.setPagination(totalPage, page);
        return paginationDTO;

    }

}
