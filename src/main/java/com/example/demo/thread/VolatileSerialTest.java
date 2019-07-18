package com.example.demo.thread;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * @Author: snh
 * @Date: create in 15:16 2019/7/16
 * @Desc: ~_~！ 测试 volatile 有序性
 * @Modified By:
 * @Version: 1.0$
 */
public class VolatileSerialTest {

    static int x=0,y=0;

    public static void main(String[] args) throws InterruptedException {
        Set<String> resultSet=new HashSet<>();
        Map<String,Integer> resultMap=new HashMap<>();

        for(int i=0; i<1000000; i++){
            x=0; y=0;
            resultMap.clear();
            Thread one=new Thread(new Runnable() {
                @Override
                public void run() {
                    int a=y;
                    x=1;
                    resultMap.put("a",a);
                }
            });
            //最诡异的一种情况为   a=1,  b=1 出现这种情况的原因是 JVM出现了指令重排的情况
            Thread other=new Thread(new Runnable() {
                @Override
                public void run() {
                    int b=x;
                    y=1;
                    resultMap.put("b",b);
                }
            });
            one.start();
            other.start();
            one.join();
            other.join();
            resultSet.add("a="+resultMap.get("a")+",b="+resultMap.get("b"));
            System.out.println(resultSet);
        }
    }
}
