package com.example.demo.ioc.condition;

import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author: snh
 * @Date: create in 14:46 2019/7/17
 * @Desc: ~_~！  用来判断当前系统是否为 Linux 系统
 * @Modified By:
 * @Version: $
 */
public class LinuxCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        Environment environment=context.getEnvironment();
        String system=environment.getProperty("os.name");

        BeanDefinitionRegistry registry=context.getRegistry();

        boolean isRegistry=registry.containsBeanDefinition("person");
        /*if(isRegistry){

        }*/

        if(system.contains("Linux") || system.contains("Red") || system.contains("Ubuntu")){
            return true;
        }
        return false;
    }
}
