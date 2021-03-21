package com.star.forum.mapper;

import com.star.forum.model.Thumb;
import com.star.forum.model.ThumbExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ThumbMapper {
    long countByExample(ThumbExample example);

    int deleteByExample(ThumbExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Thumb record);

    int insertSelective(Thumb record);

    List<Thumb> selectByExampleWithRowbounds(ThumbExample example, RowBounds rowBounds);

    List<Thumb> selectByExample(ThumbExample example);

    Thumb selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Thumb record, @Param("example") ThumbExample example);

    int updateByExample(@Param("record") Thumb record, @Param("example") ThumbExample example);

    int updateByPrimaryKeySelective(Thumb record);

    int updateByPrimaryKey(Thumb record);
}
