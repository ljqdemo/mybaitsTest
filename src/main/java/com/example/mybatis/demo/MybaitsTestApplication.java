package com.example.mybatis.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatis.demo.dao")
public class MybaitsTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybaitsTestApplication.class, args);
    }

}
