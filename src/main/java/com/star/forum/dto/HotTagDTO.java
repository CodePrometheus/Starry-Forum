package com.star.forum.dto;

import lombok.Data;

/**
 * 热门标签
 *
 * @Author: zzStar
 * @Date: 12-03-2020 17:39
 */
@Data
public class HotTagDTO implements Comparable<HotTagDTO> {

    private String name;
    private Integer priority;


    /**
     * 与传进来的参数比较
     *
     * @param hotTag
     * @return
     */
    @Override
    public int compareTo(HotTagDTO hotTag) {
        return this.getPriority() - hotTag.getPriority();
    }
}
