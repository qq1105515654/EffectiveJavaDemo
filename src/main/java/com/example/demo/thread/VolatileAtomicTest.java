package com.example.demo.thread;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Author: snh
 * @Date: create in 14:56 2019/7/16
 * @Desc: ~_~！ volatile 测试原子性
 * @Modified By:
 * @Version: 1.0$
 */
public class VolatileAtomicTest {

    private static volatile int num=0;
    private static volatile AtomicInteger integer=new AtomicInteger(0);
    // ++ 不属于原子操作

    /**
     * volatile 保证了共享变量的可见性和有序性 但是不保证原子性
     *  synchronized 保证了共享变量的 原子性，可以使用 synchronized 搭配 volatile  来保证并发编程的三大特性
     */
    public static synchronized void increase(){
        num++;
        //num= num+1;
    }

    public static void main(String[] args) throws InterruptedException {

        Thread[] threads=new Thread[10];

        for(int i=0; i<threads.length; i++){
            threads[i]=new Thread(new Runnable() {
                @Override
                public void run() {
                    for(int i=0; i<1000; i++){
                        increase();
                    }
                }
            });
            threads[i].start();
        }

        for(Thread t:threads){
            t.join();
        }

        System.out.println(num);
    }

}
