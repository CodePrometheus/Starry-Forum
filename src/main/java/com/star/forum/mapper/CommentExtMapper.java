package com.star.forum.mapper;

import com.star.forum.dto.CommentQueryDTO;
import com.star.forum.model.Comment;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentExtMapper {

    int incCommentCount(Comment comment);

    Integer countBySearch(CommentQueryDTO commentQueryDTO);

}
