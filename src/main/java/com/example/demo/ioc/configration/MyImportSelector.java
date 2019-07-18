package com.example.demo.ioc.configration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @Author: snh
 * @Date: create in 15:36 2019/7/17
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {


        return new String[]{"com.example.demo.ioc.bean.Red","com.example.demo.ioc.bean.Blue"};
    }
}
