package com.star.forum.dto;

import lombok.Data;

/**
 * @Author: zzStar
 * @Date: 12-02-2020 22:06
 */
@Data
public class UserDTO {

    private Long id;
    private String name;
    private String avatarUrl;
    private Integer vipRank;
    private Integer groupId;
    private String groupStr;
}
