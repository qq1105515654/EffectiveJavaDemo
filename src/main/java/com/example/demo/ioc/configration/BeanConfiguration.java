package com.example.demo.ioc.configration;

import com.example.demo.ioc.bean.Person;
import com.example.demo.ioc.service.IocService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @Author: snh
 * @Date: create in 18:53 2019/7/16
 * @Desc: ~_~！
 * @Modified By:
 * @Version: $
 */

@Configuration
@ComponentScan(value = "com.example.demo.ioc",includeFilters = {
       /*@ComponentScan.Filter(type = FilterType.ANNOTATION,classes = {Controller.class}),
        @ComponentScan.Filter(type = FilterType.ASSIGNABLE_TYPE,classes = {IocService.class}),*/
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {MyTypeFilter.class})
},useDefaultFilters = false)
//excludeFilters   指定扫描的时候按照指定的规则排除哪些组件
//includeFilters    指定扫描时按照指定的规则只需要哪些组件
/**
 *  FilterType.ANNOTATION  指定排除（包含）注解类型
 *  FilterType.ASSIGNABLE_TYPE  排除（包含）指定类型
 *  FilterType.REGEX  排除（包含）指定正则
 *  FilterType.ASPECTJ  aspectj表达式
 *  FilterType.CUSTOM  使用自定义规则
 */
public class BeanConfiguration {

    //如果注解没使用 value指定bean Name 则默认为方法名，如果设置了就使用 value 设置的值
    @Bean("person")
    public Person person01(){
        return new Person("张三",20);
    }



}

