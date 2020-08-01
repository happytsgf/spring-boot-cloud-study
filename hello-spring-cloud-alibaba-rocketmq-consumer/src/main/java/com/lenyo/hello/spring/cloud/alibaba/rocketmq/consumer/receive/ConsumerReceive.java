package com.lenyo.hello.spring.cloud.alibaba.rocketmq.consumer.receive;

import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.stereotype.Service;

/**
 * @Author lenyo
 * @Date 2020/2/29 19:51
 * Desc:
 */
@Service
public class ConsumerReceive {
    @StreamListener("input")
    public void receiveInput(String message) {
        System.out.println("Receive input: " + message);
    }
}
