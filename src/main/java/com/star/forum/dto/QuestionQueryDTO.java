package com.star.forum.dto;

import lombok.Data;

/**
 * 帖子
 *
 * @Author: zzStar
 * @Date: 12-02-2020 20:21
 */
@Data
public class QuestionQueryDTO {
    private String search;
    private String tag;
    private String sort;
    private Long time;
    private Integer page;
    private Integer offset;
    private Integer size;
    private Integer column2;

}
