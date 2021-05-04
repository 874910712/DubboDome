package org.chen.dubbobootproduct;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@EnableDubbo
@SpringBootApplication
public class DubboBootProductApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboBootProductApplication.class, args);
    }

}
