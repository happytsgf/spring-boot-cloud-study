package com.lenyo.hello.spring.cloud.alibaba.nacos.provider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author lenyo
 * @Date 2020/2/20 9:55
 * Desc:
 */
@SpringBootApplication
@EnableDiscoveryClient
public class NacosProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(NacosProviderApplication.class, args);
    }


 //   @Value("${server.port}")
    private String port;

    // 注入配置文件上下文
    @Autowired
    private ConfigurableApplicationContext applicationContext;

    @RestController
    public class EchoController {
        @GetMapping(value = "/echo/{message}")
        public String echo(@PathVariable String message) {
            return "Hello Nacos Discovery " + message+ " i am from port " + port;
        }
        @GetMapping(value = "/hi")
        public  String hi(){
            return "hi i am  from nacos config value  "+"port:"+applicationContext.getEnvironment().getProperty("server.port")+" user name:"
                    + applicationContext.getEnvironment().getProperty("user.name");
        }

    }

}
