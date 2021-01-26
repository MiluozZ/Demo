package com.miluo.readlinglist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
//@SpringBootApplication注解包含了三个重要注解：@Configuration、@ComponentScan、@EnableAutoConfiguration
//  @Configuration:标明该类使用Spring基于java配置，而不是xml配置
//  @ComponentScan:组件扫描，自动发现组件且注册为Spring中的Bean
//  @EnableAutoConfiguration:自动配置
public class ReadlinglistApplication {

    public static void main(String[] args) {
        SpringApplication.run(ReadlinglistApplication.class, args);
    }

}
