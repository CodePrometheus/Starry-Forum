package com.star.forum.rabbitmq;

import com.star.forum.search.SearchService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @Author: zzStar
 * @Date: 03-06-2021 10:57
 */
@Component
@Slf4j
@RabbitListener(queues = RabbitmqConfig.es_queue)
public class MqHandler {

    @Autowired
    private SearchService searchService;

    @RabbitHandler
    public void handler(PostMqMessage mqMessage) {
        log.info("mq get a msg --> {}", mqMessage.toString());

        switch (mqMessage.getType()) {
            case PostMqMessage.CREATE_OR_UPDATE:
                searchService.createOrUpdateIndex(mqMessage);
                break;
            case PostMqMessage.REMOVE:
                searchService.removeIndex(mqMessage);
                break;
            default:
                log.error("未找到对应消息类型 --> {}", mqMessage.toString());
                break;
        }
    }
}
