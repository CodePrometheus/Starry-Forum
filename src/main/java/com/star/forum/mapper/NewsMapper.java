package com.star.forum.mapper;

import com.star.forum.model.News;
import com.star.forum.model.NewsExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NewsMapper {
    long countByExample(NewsExample example);

    int deleteByExample(NewsExample example);

    int deleteByPrimaryKey(Long newsId);

    int insert(News record);

    int insertSelective(News record);

    List<News> selectByExampleWithRowbounds(NewsExample example, RowBounds rowBounds);

    List<News> selectByExample(NewsExample example);

    News selectByPrimaryKey(Long newsId);

    int updateByExampleSelective(@Param("record") News record, @Param("example") NewsExample example);

    int updateByExample(@Param("record") News record, @Param("example") NewsExample example);

    int updateByPrimaryKeySelective(News record);

    int updateByPrimaryKey(News record);
}
