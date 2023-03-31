package com.shop.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication //SpringBoot启动类注解!!
@ComponentScan("com.shop") //类似于Spring的基础类扫描包，用来扫描实体，接口和控制器
@MapperScan("com.shop.mapper") //mybatis的接口扫描包
public class StartApplication {
    public static void main(String[] args) {
        SpringApplication.run(StartApplication.class, args);
    }
}
