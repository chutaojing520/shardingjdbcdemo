package com.xiaowu.shardingjdbcdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.xiaowu.shardingjdbcdemo.dao"})
public class ShardingjdbcdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingjdbcdemoApplication.class, args);
    }

}
