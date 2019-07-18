package com.example.demo.ioc.configration;

import com.example.demo.ioc.bean.Rainbow;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: snh
 * @Date: create in 15:47 2019/7/17
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class MyImportBeanDefinitionRegister implements ImportBeanDefinitionRegistrar {

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {

        boolean isColor=registry.containsBeanDefinition("com.example.demo.ioc.bean.Color");
        boolean isBlue=registry.containsBeanDefinition("com.example.demo.ioc.bean.Blue");
        RootBeanDefinition rootBeanDefinition=new RootBeanDefinition(Rainbow.class);
        if(isColor && isBlue){
            registry.registerBeanDefinition("rainbow",rootBeanDefinition);
        }
    }
}
