package com.example.demo.ioc.configration;

import com.example.demo.ioc.bean.Car;
import com.example.demo.ioc.bean.Computer;
import com.example.demo.ioc.bean.Dog;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Bean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author: snh
 * @Date: create in 14:05 2019/7/18
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class BeanConfigurationLifeCycle {
    /**
     * Bean的生命周期
     *   Bean的创建--------->初始化---------->销毁的过程
     *
     *   初始化：
     *          单例：在容器启动时 创建Bean 之后会调用 初始化方法。
     *          多例：再获取Bean实例的时候会调用初始化方法。
     *    销毁：
     *          单例：在容器关闭的时候回调用销毁方法。
     *          多例：容器在初始化之后就不会再管理Bean。
     *
     *   1).指定初始化和销毁方法
     *          initMethod (初始化方法)
     *          destroyMethod (销毁方法)
     *   2).实现 InitializingBean 和 DisposableBean 接口中的 afterPropertiesSet（初始化） 和 destroy（销毁） 方法
     *
     *   3). 使用 JSR250 :
     *              PostConstruct 在Bean创建完成，并且属性赋值完成，来执行初始化方法
     *              PreDestroy     在容器销毁Bean之前通知我们进行清理工作
     */

    @Bean(initMethod ="init",destroyMethod = "destroy")
    public Car car(){
        return new Car();
    }

    @Bean
    public Computer computer(){
        return new Computer();
    }

    @Bean
    public Dog dog(){
        return new Dog();
    }

}
