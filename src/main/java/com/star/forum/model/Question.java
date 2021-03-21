package com.star.forum.model;

import lombok.Data;

@Data
public class Question {
    private Long id;

    private String title;

    private Long gmtCreate;

    private Long gmtModified;

    private Long creator;

    private Integer commentCount;

    private Integer viewCount;

    private Integer likeCount;

    private String tag;

    private Long gmtLatestComment;

    private Integer status;

    private Integer column2;

    private Integer permission;

    private String description;

}
