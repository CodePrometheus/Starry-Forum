package com.star.forum.search;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @Author: zzStar
 * @Date: 03-06-2021 09:50
 */
@Component
@Slf4j
public class InitializationRunner implements ApplicationRunner {

    @Autowired
    private ElasticSearchUtil elasticSearchUtil;

    @Autowired
    private PostRepository postRepository;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        log.info("开启扫描索引");
        long count = postRepository.count();
        if (count == 0) {
            log.info("===开始初始化索引===");
            elasticSearchUtil.sync();
            log.info("===初始化索引结束===");
        } else {
            log.info("===elasticsearch已存在索引===");
        }
    }
}
