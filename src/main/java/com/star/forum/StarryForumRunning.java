package com.star.forum;

import io.swagger.annotations.Api;
import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * 奔跑吧，zzStar
 *
 * @Author: zzStar
 * @Date: 12-01-2020 14:52
 */
@Api(hidden = true)
@SpringBootApplication
@EnableScheduling
@MapperScan("com.star.forum.mapper")
@Slf4j
public class StarryForumRunning {

    public static void main(String[] args) {
        SpringApplication.run(StarryForumRunning.class, args);
        log.info("=============== Starry Forum Running ===============");
    }

}
