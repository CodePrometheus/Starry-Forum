package com.star.forum.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.star.forum.model.Question;
import com.star.forum.model.QuestionExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionMapper extends BaseMapper<Question> {

    long countByExample(QuestionExample example);


    int deleteByExample(QuestionExample example);


    int deleteByPrimaryKey(Long id);


    int insert(Question record);


    int insertSelective(Question record);


    List<Question> selectByExampleWithBLOBsWithRowbounds(QuestionExample example, RowBounds rowBounds);


    List<Question> selectByExampleWithBLOBs(QuestionExample example);


    List<Question> selectByExampleWithRowbounds(QuestionExample example, RowBounds rowBounds);


    List<Question> selectByExample(QuestionExample example);


    Question selectByPrimaryKey(Long id);


    int updateByExampleSelective(@Param("record") Question record, @Param("example") QuestionExample example);


    int updateByExampleWithBLOBs(@Param("record") Question record, @Param("example") QuestionExample example);


    int updateByExample(@Param("record") Question record, @Param("example") QuestionExample example);


    int updateByPrimaryKeySelective(Question record);


    int updateByPrimaryKeyWithBLOBs(Question record);


    int updateByPrimaryKey(Question record);
}
