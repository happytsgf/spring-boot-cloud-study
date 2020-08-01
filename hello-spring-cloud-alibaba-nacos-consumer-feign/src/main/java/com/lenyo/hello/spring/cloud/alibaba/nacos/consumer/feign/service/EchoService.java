package com.lenyo.hello.spring.cloud.alibaba.nacos.consumer.feign.service;

import com.lenyo.hello.spring.cloud.alibaba.nacos.consumer.feign.service.fallback.EchoServiceFallback;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @Author lenyo
 * @Date 2020/2/20 12:37
 * Desc:
 */
@FeignClient(value = "nacos-provider",fallback = EchoServiceFallback.class )
public interface EchoService {
    @GetMapping(value = "/echo/{message}")
    String echo(@PathVariable("message") String message);
}
