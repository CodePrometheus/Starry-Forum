package com.star.forum.rabbitmq;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: zzStar
 * @Date: 03-06-2021 10:46
 */
@Data
@AllArgsConstructor
public class PostMqMessage implements Serializable {

    public static final String CREATE_OR_UPDATE = "create_update";
    public static final String REMOVE = "remove";

    private Long postId;

    private String type;
}
