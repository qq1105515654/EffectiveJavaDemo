package com.example.demo.ioc.bean;

/**
 * @Author: snh
 * @Date: create in 14:08 2019/7/18
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class Car {

    private String name;

    public Car(){
        System.out.println(" Car Constructor");
    }

    public void init(){
        System.out.println("Car------------init------");
    }

    public void destroy(){
        System.out.println("Car------------destroy------");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
