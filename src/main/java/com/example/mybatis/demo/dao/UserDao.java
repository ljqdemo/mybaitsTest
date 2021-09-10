package com.example.mybatis.demo.dao;

import com.example.mybatis.demo.entity.User;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author gino
 * 2021-09-09
 */

@Repository
public interface UserDao {
    //使用@Param
    public User getUserById(@Param("id") int id);

    public List<User> getUserByAge(@Param("age") int age);
}
