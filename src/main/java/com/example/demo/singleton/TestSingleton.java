package com.example.demo.singleton;


public class TestSingleton {


    public static void main(String[] args) {

        Elvis elvis=Elvis.INSTANCE;
        Elvis elvis1=Elvis.INSTANCE;

        System.out.println(elvis);
        System.out.println(elvis1);

        Elvish elvish=Elvish.getInstance();

        Elvish elvish1=Elvish.getInstance();

        System.out.println(elvish);
        System.out.println(elvish1);
    }
}
