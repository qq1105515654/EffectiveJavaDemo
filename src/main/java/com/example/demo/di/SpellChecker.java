package com.example.demo.di;

import java.util.Objects;


/**
 *  依赖注入就是 如果我要创建SpellChecker 这个类的对象，必须先创建它所依赖的 Lexicon 这个类
 */
public class SpellChecker {

    private final Lexicon dictionary;

    public SpellChecker(Lexicon dictionary){
        this.dictionary= Objects.requireNonNull(dictionary);
    }


    public static void main(String[] args) {

        //System.out.println(isRomanNumbers("DM"));
        long startTime=System.currentTimeMillis();
        sum();
        long endTime=System.currentTimeMillis();
        /**
         *  在使用基础类型计算时，尽量减少使用包装类型
         *  在这个例子中：使用包装类型  Long  进行循环运算时，消耗的时间约为 ：8.8 秒
         *  使用基础类型 long 所消耗的时间为 0.6秒   性能整整差了 12 倍
         */
        System.out.println("Consume time："+(endTime-startTime));
    }


    public static long sum(){
        long sum=0L;
        //Long sum=0L;
        for(int i=0; i<Integer.MAX_VALUE; i++){
            sum+=i;
        }
        return sum;
    }


    public static boolean isRomanNumbers(String s){
        return s.matches("^(?=.)M*(C[MD]|D?C{0,3})(X[CL]|L?X{0,3})(I[XV]|V?I{0,3})$");
    }
}
