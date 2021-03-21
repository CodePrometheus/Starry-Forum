package com.star.forum.dto;

import lombok.Data;

/**
 * @Author: zzStar
 * @Date: 12-06-2020 17:03
 */
@Data
public class ThumbDTO {
    private Long id;
    private Long targetId;
    private Integer type;
    private UserDTO user;
    private Long gmtCreate;
    private Long gmtModified;

}
