package com.example.demo.thread;

/**
 * @Author: snh
 * @Date: create in 13:22 2019/7/16
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class ThreadModel {

    private static volatile boolean initFlags=false;

    //将Java 代码编译成汇编代码
    // -server -Xcomp -XX:+UnlockDiagnosticVMOptions -XX:+PrintAssembly -XX:CompileCommand=compileonly,*ThreadModel.prepareData
    //需要先添加  hsdis 的插件 所属于 C 的类库
    public static void main(String[] args) throws InterruptedException {

        new Thread(() ->{

            while(!initFlags){

            }

        }).start();

        Thread.sleep(2000);

        new Thread(() ->{
            prepareData();

        }).start();
    }


    public static void prepareData(){
        initFlags=true;
    }


}
