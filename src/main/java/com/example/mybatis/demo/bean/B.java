package com.example.mybatis.demo.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author gino
 * 2021-09-10
 */
@Component
public class B {

    @Autowired
    private A a;

    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public B(A a) {
        this.a = a;
    }

    public B() {
    }
}
