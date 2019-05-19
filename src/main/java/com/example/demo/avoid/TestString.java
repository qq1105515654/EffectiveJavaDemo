package com.example.demo.avoid;

public class TestString {


    public static void main(String[] args) {

        //尽量减少这样创建String 对象，如果某个方法频繁被调用 而其中包含这一行代码的话，
        // 那样就会频繁的创建String 对象 尽管他的字面值都一样。
        String s=new String("hello");

        //使用这种方式，如果是第一次的话会创建一个String 对象，
        // 往后的引用如果都是字面值 ‘hello’ 并且也是使用这种方式引用的话 往后所有的 引用所引用的对象都是来自同一个地址
        String str="hello";
        String str1="hello";

        System.out.println(str==str1); //true
        System.out.println(str==s); //false

        long strStartTime=System.currentTimeMillis();
        for(int i=0; i<10000; i++){
            str+=i;
        }
        long strEndTime=System.currentTimeMillis();
        System.out.println("String concat consume time："+(strEndTime-strStartTime));

        long builderStartTime=System.currentTimeMillis();
        concat(str1);
        long builderEndTime=System.currentTimeMillis();

        System.out.println("StringBuilder append consume time："+(builderEndTime-builderStartTime));
    }



    /**
     * 如果 一个字符串频繁被改变的话，必须考虑使用 StringBuilder(线程不安全，效率高) 或者 StringBuffer(线程安全对比 StringBuilder 效率较低)
     */
    public static String concat(String s){
        StringBuilder sb=new StringBuilder(s);
        for(int i=0; i<10000; i++){
            sb.append(i);
        }
        return sb.toString();
    }

}
