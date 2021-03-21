package com.star.forum.dto;


import lombok.Data;

/**
 * @Author: zzStar
 * @Date: 12-05-2020 10:26
 */
@Data
public class CommentDTO {

    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Long gmtCreate;
    private Long gmtModified;
    private String gmtModifiedStr;
    private Long likeCount = 0L;
    private Integer commentCount = 0;
    private String content;
    private UserDTO user;
}
