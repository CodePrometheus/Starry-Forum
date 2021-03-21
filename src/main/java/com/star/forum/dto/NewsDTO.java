package com.star.forum.dto;

import com.alibaba.fastjson.JSONArray;
import lombok.Data;

@Data
public class NewsDTO {
    private String id;
    private Long newsId;

    private String title;
    private String content;
    private String html;
    private String link;
    private String source;
    private Boolean havePic;
    private String pubDate;
    private JSONArray imageurls;
    private String imageurl1;
    private String imageurl2;
    private String imageurl3;


    private String description;
    private String tag;
    private Long gmtCreate;
    private Long gmtModified;

    // private Long creator;
    private Integer viewCount;
    private Integer commentCount;
    private Integer likeCount;
    // private User user;
    // private UserAccount userAccount;
    private Long gmtLatestComment;
    private Integer status;
    private Integer column2;
    private String columnStr;
    //private Integer permission;

}
