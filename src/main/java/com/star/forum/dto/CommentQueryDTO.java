package com.star.forum.dto;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * 评论查询
 *
 * @Author: zzStar
 * @Date: 12-02-2020 15:51
 */
@Data
@Accessors(chain = true)
public class CommentQueryDTO {

    private Long id;
    private Long parentId;
    private Integer type;
    private Long commentator;
    private Integer page;
    private Integer size;
    private Integer offset;
    private String sort;
    private String order;

    /**
     * 对非法输入的参数进行转化
     */
    public void convert() {
        if (this.page == null || this.page <= 0) {
            this.page = 1;
        }
        if (this.size == null || this.size <= 0 || this.size > 20) {
            this.size = 5;
        }
        if (this.sort == null || !("gmt_modified".equals(this.sort) || "gmt_create".equals(this.sort))) {
            this.sort = "gmt_create";
        }
        if (this.order == null || !("desc".equals(this.order) || "asc".equals(this.order))) {
            this.order = "desc";
        }
    }


}
