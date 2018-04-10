package com.cpp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import org.springframework.scheduling.annotation.EnableScheduling;

@MapperScan("com.cpp.mybatis")
@SpringBootApplication
@ComponentScan
@EnableScheduling   //开启定时任务
@ImportResource("classpath*:total_config.xml")
@EnableCaching
public class BackendApplication {
    public static void main(String[] args) {
        //test
        SpringApplication.run(BackendApplication.class, args);
    }
}
