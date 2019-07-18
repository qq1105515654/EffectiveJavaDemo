package com.example.demo.ioc.bean;

/**
 * @Author: snh
 * @Date: create in 18:52 2019/7/16
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class Person {

    private String name;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
        super();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
