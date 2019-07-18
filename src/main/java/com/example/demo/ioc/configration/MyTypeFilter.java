package com.example.demo.ioc.configration;

import com.example.demo.ioc.service.IocService;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @Author: snh
 * @Date: create in 20:22 2019/7/16
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class MyTypeFilter implements TypeFilter {
    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        //获取当前类的注解信息
        AnnotationMetadata annotationMetadata=metadataReader.getAnnotationMetadata();
        //获取当前类的类信息
        ClassMetadata classMetadata=metadataReader.getClassMetadata();
        //获取当前类的资源信息（如：类路径等）
        Resource resource=metadataReader.getResource();

        String className=classMetadata.getClassName();
        if(className.contains("con")){
            System.out.println("Class name------>"+className);
            return true;
        }
        return false;
    }
}
