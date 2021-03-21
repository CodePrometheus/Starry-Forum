package com.star.forum.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @Description: 评论创建视图对象
 * @Author: zzStar
 * @Date: 12-10-2020 19:46
 */
@Data
@ApiModel(description = "评论创建视图对象")
public class CommentInsertVO {
    @ApiModelProperty(value = "评论目标的id", required = true, example = "1")
    @NotNull(message = "评论目标id不允许为空")
    private Long parentId;

    @ApiModelProperty(value = "评论内容", required = true)
    @NotBlank(message = "评论内容不允许为空")
    private String content;

    @ApiModelProperty(value = "评论类型,1为回复主题，2为回复评论", required = true, example = "1")
    @NotNull(message = "评论类型不允许为空")
    private Integer type;

    @ApiModelProperty(value = "此token在完成验证后自动生成", required = true)
    @NotBlank(message = "评论必须携带token")
    private String token;

    @ApiModelProperty(value = "用户的ip地址", required = true)
    @NotBlank(message = "评论必须携带ip")
    private String ip;
}
