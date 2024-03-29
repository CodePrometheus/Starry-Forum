package com.star.forum.search;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.util.Date;

/**
 * @Author: zzStar
 * @Date: 03-05-2021 23:48
 */
@Data
@Document(indexName = "starry-forum")
public class Post {

    @Id
    private Long id;

    @Field(type = FieldType.Text, analyzer = "ik_max_word")
    private String title;

    private Long authorId;

    @Field(type = FieldType.Text)
    private String authorName;

    private String authorAvatar;

    private Integer level;

    private Boolean recommend;

    private Integer commentCount;

    private Integer viewCount;

    @Field(type = FieldType.Text)
    private String tag;

    private Date createTime;

}
