package com.example.mybatis.demo.test.config;

import com.example.mybatis.demo.entity.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gino
 * 2021-09-14
 */
@Configuration
public class testConfig {

    @Bean
    public User user1(){
        return  new User();
    }

    @Bean
    public User user2(){
        return  new User();
    }
}
