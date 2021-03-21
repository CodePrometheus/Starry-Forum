package com.star.forum.dto;

import lombok.Data;

import java.util.List;

/**
 * @Author: zzStar
 * @Date: 12-05-2020 15:28
 */
@Data
public class TagDTO {
    private String categoryName;
    private List<String> tags;
}
