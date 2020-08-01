package com.lenyo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback;

import com.lenyo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.stereotype.Component;

/**
 * @Author lenyo
 * @Date 2020/2/21 12:16
 * Desc:
 */
@Component
public class EchoServiceFallback implements EchoService{

    @Override
    public String echo(String message) {
        return "echo 熔断 fallback";
    }
}
