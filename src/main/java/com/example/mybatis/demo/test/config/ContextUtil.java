package com.example.mybatis.demo.test.config;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author gino
 * 2021-09-14
 */
@Component
public class ContextUtil implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        ContextUtil.applicationContext = applicationContext;
    }

    public Object  getBean(String name){
        return  applicationContext.getBean(name);
    }

    public <T> T  getBean(String name,Class<T> tClass){
        return tClass.cast(getBean(name));
    }
}
