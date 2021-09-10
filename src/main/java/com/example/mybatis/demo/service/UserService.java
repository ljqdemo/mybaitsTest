package com.example.mybatis.demo.service;

import com.example.mybatis.demo.dao.UserDao;
import com.example.mybatis.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service()
public class UserService {

    @Autowired
    private UserDao userDao;

    public User queryUser(int id){
        return userDao.getUserById(id);
    }
    public List<User> queryUser2(int age){
        return userDao.getUserByAge(age);
    }
}
