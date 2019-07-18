package com.example.demo.ioc.bean;

import org.springframework.beans.factory.FactoryBean;

/**
 * @Author: snh
 * @Date: create in 18:47 2019/7/17
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class ColorFactoryBean implements FactoryBean {

    @Override
    public Object getObject() throws Exception {
        return new Color();
    }

    @Override
    public Class<?> getObjectType() {
        return Color.class;
    }

    /**
     *  实现的默认为 false 不是单例，为多例
     *  true 为 单例
     * @return
     */
    @Override
    public boolean isSingleton() {
        return true;
    }
}
