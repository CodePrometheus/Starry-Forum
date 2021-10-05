package com.star.forum.schedule;

import com.star.forum.search.ElasticSearchUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @Author: zzStar
 * @Date: 03-07-2021 21:35
 */
@Slf4j
public class ElasticSearchTasks {

    @Autowired
    private ElasticSearchUtil elasticSearchUtil;

    /**
     * 每天凌晨1点刷新elasticsearch
     */
    @Scheduled(cron = "0/2 * * * * ?")
    private void resetElasticSearch() {
        log.info("===刷新elasticsearch开始===");
        elasticSearchUtil.sync();
        log.info("===刷新elasticsearch结束===");
    }
}
