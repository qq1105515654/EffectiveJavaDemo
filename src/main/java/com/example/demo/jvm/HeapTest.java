package com.example.demo.jvm;

import java.util.ArrayList;

/**
 * @Author: snh
 * @Date: create in 21:24 2019/7/11
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class HeapTest {

    byte[] a=new byte[1024*100];

    /**
     *  打印GC 日志： -XX:+PrintGCDetails 打印GC运行详情  -XX:+PrintGCDateStamps 打印GC触发时间  -Xloggc:./gc.log 将GC日志输出到当前项目目录下指定的日志文件中
     *  用以控制最大GC停顿时间的 -XX:MaxGCPauseMillis  直接控制吞吐量的参数-XX:GCTimeRatio
     * @param args
     * @throws InterruptedException
     */
    public static void main(String[] args) throws InterruptedException {

        ArrayList<HeapTest> heapTests=new ArrayList<>();

        while(true){
            heapTests.add(new HeapTest());
            Thread.sleep(100);
        }
    }

}
