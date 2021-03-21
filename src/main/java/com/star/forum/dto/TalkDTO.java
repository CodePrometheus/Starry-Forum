package com.star.forum.dto;

import lombok.Data;

/**
 * @Author: zzStar
 * @Date: 12-02-2020 22:06
 */
@Data
public class TalkDTO {
    private Long id;
    private Integer type;
    private Integer status;
    private Integer permission;
    private Long gmtCreate;
    private Long gmtModified;
    private Long gmtLatestComment;
    //private String gmtModifiedStr;
    private Integer viewCount = 0;
    private Integer likeCount = 0;
    private Integer commentCount = 0;
    private String description;
    private String title;
    private String images;
    private String video;
    private UserDTO user;
}
