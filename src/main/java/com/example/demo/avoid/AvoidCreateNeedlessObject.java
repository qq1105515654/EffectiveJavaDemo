package com.example.demo.avoid;

public class AvoidCreateNeedlessObject {

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
