package com.lenyo.hello.spring.cloud.alibaba.nacos.consumer.feign.controller;

import com.lenyo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.EchoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lenyo
 * @Date 2020/2/20 12:35
 * Desc:
 */
@RestController
public class NacosConsumerFeignController {
    @Autowired
    private EchoService echoService;

    @GetMapping(value = "/echo/hi/{message}")
    public String echo(@PathVariable String message) {
        return echoService.echo("Hi Feign "+message +" ");
    }
}
