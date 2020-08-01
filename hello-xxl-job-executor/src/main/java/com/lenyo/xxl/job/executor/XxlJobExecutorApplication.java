package com.lenyo.xxl.job.executor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
/**
 * @Author lenyo
 * @Date 2020/4/29 16:42
 * Desc:
 */
@SpringBootApplication
public class XxlJobExecutorApplication {

    public static void main(String[] args) {
        SpringApplication.run(XxlJobExecutorApplication.class, args);
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
