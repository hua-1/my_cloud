package com.hua.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
public class RabbitConfig {
    /**
     * 定义一个名为：oKong 的队列
     * @return
     */
    @Bean
    public Queue okongQueue() {
        log.info("mq创建队列");
        return new Queue("okong");
    }

}
