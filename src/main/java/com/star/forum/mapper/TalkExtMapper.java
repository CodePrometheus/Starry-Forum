package com.star.forum.mapper;


import com.star.forum.dto.TalkQueryDTO;
import com.star.forum.model.Talk;

public interface TalkExtMapper {

    Integer count(TalkQueryDTO talkQueryDTO);

    int updateByPrimaryKeySelective(Talk talk);
}
