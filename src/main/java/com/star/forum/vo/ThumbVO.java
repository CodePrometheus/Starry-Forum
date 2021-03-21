package com.star.forum.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * 点赞/收藏创建视图对象
 *
 * @Author: zzStar
 * @Date: 12-06-2020 17:08
 */
@Data
@ApiModel(description = "点赞/收藏创建视图对象")
public class ThumbVO {

    @ApiModelProperty(value = "点赞/收藏目标的id", required = true, example = "1")
    @Min(value = 1L, message = "评论目标id必须大于0")
    @NotNull(message = "评论目标id不允许为空")
    private Long targetId;
    @ApiModelProperty(value = "点赞/收藏目标的类型", required = true, example = "1")
    @Min(value = 1, message = "评论目标类型必须大于0")
    @NotNull(message = "评论目标类型不允许为空")
    private Integer type;
}

