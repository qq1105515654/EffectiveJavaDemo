package com.example.demo;

import com.example.demo.ioc.configration.BeanConfigurationLifeCycle;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: snh
 * @Date: create in 14:24 2019/7/18
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class IocBeanLifeCycleTests {

    @Test
    public void test01(){
        ApplicationContext context= new AnnotationConfigApplicationContext(BeanConfigurationLifeCycle.class);

        System.out.println("容器创建完毕..............");


        ((AnnotationConfigApplicationContext) context).close();


    }
}
