package com.star.forum.dto;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

/**
 * 分页
 *
 * @Author: zzStar
 * @Date: 12-03-2020 12:00
 */
@Data
@Accessors(chain = true)
public class PaginationDTO<T> {

    private List<T> data;

    private Boolean showPrevious;

    private Boolean showFirstPage;

    private Boolean showNext;

    private Boolean showEndPage;

    // 当前页
    private Integer page;

    private List<Integer> pages = new ArrayList<>();

    private Integer totalPage;

    private Integer totalCount;

    /**
     * 处理分页逻辑
     *
     * @param totalPage
     * @param page
     */
    public void setPagination(Integer totalPage, Integer page) {
        this.totalPage = totalPage;
        this.page = page;

        if (totalPage != 0) {
            pages.add(page);
        }

        /**
         * 显示前后各三页
         */
        for (int i = 1; i <= 3; i++) {
            if (page - i > 0) {
                // 往前加
                pages.add(0, page - i);
            }
            if (page + i <= totalPage) {
                // 往后加
                pages.add(page + i);
            }
        }


        /**
         * 是否展示上下一页
         */
        if (page == 1) {
            showPrevious = false;
        } else {
            showPrevious = true;
        }

        if (page.equals(totalPage) || totalPage == 0) {
            showNext = false;
        } else {
            showNext = true;
        }


        /**
         * 是否展示首末页
         */
        if (pages.contains(1) || totalPage == 0) {
            showFirstPage = false;
        } else {
            showFirstPage = true;
        }

        if (pages.contains(totalPage) || totalPage == 0) {
            showEndPage = false;
        } else {
            showEndPage = true;
        }
    }
}
