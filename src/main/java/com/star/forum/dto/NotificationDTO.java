package com.star.forum.dto;

import lombok.Data;

/**
 * 通知
 *
 * @Author: zzStar
 * @Date: 12-05-2020 22:57
 */
@Data
public class NotificationDTO {

    private Long id;
    private Long gmtCreate;
    private Integer status;
    private Long notifier;
    private String notifierName;
    private String outerTitle;
    private Long outerid;
    private String typeName;
    private Integer type;
}
