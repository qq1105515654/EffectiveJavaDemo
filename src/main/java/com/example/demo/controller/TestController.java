package com.example.demo.controller;

import org.apache.catalina.core.ApplicationContext;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.session.SqlSessionManager;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.config.AbstractFactoryBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.XmlWebApplicationContext;

@RestController
public class TestController {

    @RequestMapping("/hello")
    public String init(){

        return "Hello World";
    }


    public static void main(String[] args) {

        ClassPathXmlApplicationContext ctx=new ClassPathXmlApplicationContext("User.xml");

        User user= (User) ctx.getBean("user");

        System.out.println(user);
       /* try {
            SqlSessionFactory sessionFactory=new SqlSessionFactoryBean().getObject();
        } catch (Exception e) {
            e.printStackTrace();
        }*/

    }
}
