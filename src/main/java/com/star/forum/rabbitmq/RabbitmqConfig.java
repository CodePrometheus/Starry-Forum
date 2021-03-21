package com.star.forum.rabbitmq;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Author: zzStar
 * @Date: 03-06-2021 10:26
 */
@Configuration
public class RabbitmqConfig {

    public final static String es_queue = "starry_es_queue";
    public final static String es_change = "starry_es_change";
    public final static String es_bind_key = "starry_es_bind_key";

    @Bean
    public Queue queue() {
        return new Queue(es_queue);
    }

    @Bean
    public DirectExchange directExchange() {
        return new DirectExchange(es_change);
    }

    @Bean
    public Binding binding(Queue queue, DirectExchange directExchange) {
        return BindingBuilder.bind(queue).to(directExchange).with(es_bind_key);
    }
}
