package com.example.demo.builder;

public class TestBuilderObject {

    //使用构建器构造对象，使对象不可变
    public static void main(String[] args) {


        Person person= new Person.Builder()
                .name("张三")
                .age(20)
                .height(188)
                .weight(190)
                .buidler();
        System.out.println(person);


        Clazz clazz=new Clazz.Builder().setId(1601)
                .setClzName("软件开发班")
                .setTeacher("老杨")
                .builder();

        System.out.println(clazz);
    }
}
