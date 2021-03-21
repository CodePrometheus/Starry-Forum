package com.star.forum.dto;

import lombok.Data;

/**
 * @Author: zzStar
 * @Date: 12-02-2020 19:58
 */
@Data
public class NewsQueryDTO {

    private String search;
    private String tag;
    private String sort;
    private Long time;
    private Integer offset;
    private Integer size;
    private Integer column2;

}
