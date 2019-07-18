package com.example.demo.ioc.bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: snh
 * @Date: create in 14:46 2019/7/18
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class Dog {

    public Dog(){
        System.out.println("Dog constructor");
    }

    @PostConstruct
    public void init(){
        System.out.println("Dog-------------init----------");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("Dog-------------destroy---------");
    }
}
