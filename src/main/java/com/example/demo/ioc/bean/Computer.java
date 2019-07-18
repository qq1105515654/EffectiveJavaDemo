package com.example.demo.ioc.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * @Author: snh
 * @Date: create in 14:34 2019/7/18
 * @Desc: ~_~！
 * @Modified By:
 * @Version: 1.0$
 */
public class Computer implements InitializingBean, DisposableBean {

    private String systemName;

    private String version;

    public Computer(){
        System.out.println("Computer   Constructor");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Computer---------destroy------------");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Computer---------afterPropertiesSet----------");
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
