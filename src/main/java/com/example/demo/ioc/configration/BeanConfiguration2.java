package com.example.demo.ioc.configration;

import com.example.demo.ioc.bean.Color;
import com.example.demo.ioc.bean.ColorFactoryBean;
import com.example.demo.ioc.bean.Person;
import com.example.demo.ioc.condition.LinuxCondition;
import com.example.demo.ioc.condition.WindowsCondition;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.*;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: snh
 * @Date: create in 13:33 2019/7/17
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
@Configuration
@Import({Color.class,MyImportSelector.class,MyImportBeanDefinitionRegister.class})
public class BeanConfiguration2 {

    /**
     *  默认是单例模式
     *
     *  SCOPE_PROTOTYPE   prototype 多例模式
     *    容器启动时不会创建对象，只有在获取Bean 实例的时候才会容器才会去创建
     *
     *  SCOPE_SINGLETON   singleton   单例模式
     *    在容器启动时就已经创建好实例了。所以每次从容器中获取的 Bean实例都是同一个实例。
     *
     *  SCOPE_REQUEST      request   同一个请求创建一个实例  属于Web应用中的作用于  WebApplicationContext
     *
     *  SCOPE_SESSION      session    同一个 session创建一个实例  WebApplicationContext
     *
     *  懒加载：  默认情况下单实例会在容器启动时就会初始化对象实例
     *                懒加载的情况下，容器启动时不会初始化对象实例，而是会在第一次使用（获取）Bean 时才会初始化该对象实例。
     *                懒加载只针对于单例模式。
     * @return
     */
    //@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
    //@Lazy
    @Bean
    public Person person(){
        System.out.println("容器开始创建Person.............");
        return new Person("lisi",25);
    }

    /**
     * @Conditional  满足条件就往容器中注册 Bean，否则就不往容器中注册。
     *
     * @return
     */
    @Conditional({WindowsCondition.class})
    @Bean("bill")
    public Person person01(){
        System.out.println("开始创建Windows 环境中的Bean");
        return new Person("Bill Gates",62);
    }

    @Conditional({LinuxCondition.class})
    @Bean("linus")
    public Person person02(){
        System.out.println("开始创建Linux 环境中的Bean");
        return new Person("Linus",52);
    }
    /*
    *  往容器中注册组件的方式：
    *   1. 使用包扫描 添加（@Controller/@Service/@Repository/@Component）
    *   2. 使用 @Bean （导入第三方的组件到容器中）
    *   3. 使用@Import （快速给容器导入组件）
    *               1). 通过@Import({xxx.class,xxxx.class}) 直接导入
    *               2). 通过 ImportSelector 需要返回一个包含全类名的String数组。
    *               3). 通过 ImportBeanDefinitionRegistrar 手动注册Bean到容器中
    *
    *   4.使用Spring提供的 FactoryBean(工厂Bean)
    *               1). 默认获取到的是工厂Bean 调用 getObject所创建的对象
    *               2). 想要获取到工厂Bean 本身需要在 Id 前面添加一个 & 符号 如：&colorFactoryBean
    *
    *
    *
    * */

    @Bean
    public ColorFactoryBean colorFactoryBean(){
        return new ColorFactoryBean();
    }

}
