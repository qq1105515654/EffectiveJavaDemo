package com.example.demo.singleton;

/**
 * 单例模式有两种实现方式：第一种 使用公有的静态域来实现
 */
//使用单例模式 ,使用共有的 静态 final域来实例化该对象
public class Elvis {
    // Elvis elvis=Elvis.INSTANCE;
    public static final Elvis INSTANCE=new Elvis();

    private Elvis(){};


}
