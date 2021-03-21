package com.star.forum.mapper;

import com.star.forum.dto.NewsQueryDTO;
import com.star.forum.model.News;

import java.util.List;

/**
 * @Author: zzStar
 * @Date: 12-02-2020 19:57
 */
public interface NewsExtMapper {

    int incView(News record);

    Integer countBySearch(NewsQueryDTO newsQueryDTO);

    List<News> selectBySearch(NewsQueryDTO newsQueryDTO);

}
