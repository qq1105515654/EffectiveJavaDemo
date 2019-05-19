package com.example.demo.singleton;

import java.io.Serializable;

/**
 * 单例模式的第二种实现方式
 */
public class Elvish implements Serializable {

    private static final Elvish instance=new Elvish();

    private Elvish(){};

    private Object readResolve(){
        return instance;
    }

    public static Elvish getInstance(){
        return instance;
    }
}
