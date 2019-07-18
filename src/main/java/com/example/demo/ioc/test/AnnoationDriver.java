package com.example.demo.ioc.test;

import com.example.demo.ioc.bean.Person;
import com.example.demo.ioc.configration.BeanConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author: snh
 * @Date: create in 18:56 2019/7/16
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class AnnoationDriver {

    public static void main(String[] args) {

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Person person =applicationContext.getBean(Person.class);

        String[] names=applicationContext.getBeanNamesForType(Person.class);

        for (String name: names) {
            System.out.println(name);
        }

        System.out.println(person);
    }
}
