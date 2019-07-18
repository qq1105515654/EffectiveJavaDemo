package com.example.demo.ioc.test;

import com.example.demo.ioc.configration.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: snh
 * @Date: create in 19:34 2019/7/16
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class ScanConfigTest {

    @SuppressWarnings("resouce")

    public void test01(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        String[] names=applicationContext.getBeanDefinitionNames();

        for (String name:names
             ) {
            System.out.println(name);
        }
    }
}
