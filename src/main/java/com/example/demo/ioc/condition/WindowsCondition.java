package com.example.demo.ioc.condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: snh
 * @Date: create in 14:46 2019/7/17
 * @Desc: ~_~！ 用来判断当前系统是否为 Windows系统
 * @Modified By:
 * @Version: 1.0$
 */
public class WindowsCondition implements Condition {

    /**
     *      ConditionContext  判断条件所使用的上下文 （环境）
     *      AnnotatedTypeMetadata 判断条件获取的注释信息
     *
     * @param context
     * @param metadata
     * @return
     */
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {

        //获取bean工厂信息
        ConfigurableListableBeanFactory listableBeanFactory=context.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader=context.getClassLoader();
        System.out.println(classLoader);

        //获取bean定义的注册类
        BeanDefinitionRegistry registry=context.getRegistry();

        //获取资源加载器
        ResourceLoader resourceLoader=context.getResourceLoader();

        Environment environment=context.getEnvironment();
        String system=environment.getProperty("os.name");
        if(system.contains("Windows")) {
            return true;
        }
        return false;
    }
}
