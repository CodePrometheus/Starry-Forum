package com.star.forum.mapper;


import com.star.forum.model.Talk;
import com.star.forum.model.TalkExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface TalkMapper {
    long countByExample(TalkExample example);

    int deleteByExample(TalkExample example);

    int deleteByPrimaryKey(Long id);

    int insert(Talk record);

    int insertSelective(Talk record);

    List<Talk> selectByExampleWithRowbounds(TalkExample example, RowBounds rowBounds);

    List<Talk> selectByExample(TalkExample example);

    Talk selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByExample(@Param("record") Talk record, @Param("example") TalkExample example);

    int updateByPrimaryKeySelective(Talk record);

    int updateByPrimaryKey(Talk record);
}