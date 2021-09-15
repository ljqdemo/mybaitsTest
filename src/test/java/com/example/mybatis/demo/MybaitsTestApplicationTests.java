package com.example.mybatis.demo;

import com.example.mybatis.demo.dao.UserDao;
import com.example.mybatis.demo.entity.User;
import com.example.mybatis.demo.test.config.ContextUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.IOException;
import java.io.InputStream;

@SpringBootTest
class MybaitsTestApplicationTests {

    @Autowired
    private ContextUtil contextUtil;

    @Test
    void contextLoads() {


    }

    @Test
    public void test2(){

         User user= (User) contextUtil.getBean("user1");
        System.out.println("user"+user.toString());
        User user1= (User) contextUtil.getBean("user2");
        System.out.println("user1"+user1.toString());
        System.out.println(user1.equals(user));
    }
    @Test
    public void test1() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        //构造着模式创建 SqlSessionFactory
        /**
         * build 主要做了如下事情，
         * 1：调用XMLConfigBuilder 去解析xml文件
         * 2： 解析后会得到Configuration 类
         * 3. 调用DeafualtSqlSessionFactory 构造方法（传入得到Configiration）
         *  4 返回 DefaultSqlSessionFactory
         */

        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        try {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            User entity = mapper.getUserById(1);
            //如果上一个sqlsession  不commit 是无法触发二级缓存的
            sqlSession.commit();



            System.out.println("二级缓存测试2");
            SqlSession sqlSession2 = sqlSessionFactory.openSession();
            UserDao mapper1 = sqlSession2.getMapper(UserDao.class);

            mapper1.getUserById(1);

            System.out.println(entity.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            sqlSession.close();
        }
    }


    public void getBean(){

    }
}
