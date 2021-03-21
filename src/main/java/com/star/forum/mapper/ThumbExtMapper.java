package com.star.forum.mapper;


import com.star.forum.dto.LikeQueryDTO;
import com.star.forum.model.Comment;
import com.star.forum.model.Question;

public interface ThumbExtMapper {
    int incLikeCount(Comment comment);

    int incQuestionLikeCount(Question question);

    Integer count(LikeQueryDTO likeQueryDTO);
}
