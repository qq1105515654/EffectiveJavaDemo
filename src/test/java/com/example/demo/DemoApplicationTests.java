package com.example.demo;

import com.example.demo.ioc.bean.Person;
import com.example.demo.ioc.configration.BeanConfiguration;
import com.example.demo.ioc.configration.BeanConfiguration2;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Map;

/*@RunWith(SpringRunner.class)
@SpringBootTest*/
public class DemoApplicationTests {

    ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration2.class);

    @SuppressWarnings("resouce")
    @Test
    public void contextLoads() {


        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration.class);

        String[] names=applicationContext.getBeanDefinitionNames();

        for (String name:names
        ) {
            System.out.println(name);
        }
    }



    @Test
    public void test2(){

        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration2.class);


        /*String[] names=applicationContext.getBeanDefinitionNames();

        for (String name:names
             ) {
            System.out.println(name);
        }*/

        System.out.println("容器启动完毕.............");

        Person person=applicationContext.getBean(Person.class);
        Person person1=applicationContext.getBean(Person.class);
        System.out.println(person==person1);

    }

    @Test
    public void test3(){
        ApplicationContext applicationContext=new AnnotationConfigApplicationContext(BeanConfiguration2.class);

        //获取当前运行环境
        Environment environment=applicationContext.getEnvironment();

        String system=environment.getProperty("os.name");
        System.out.println(system);

        String[] names=applicationContext.getBeanNamesForType(Person.class);

        for (String name: names){
            System.out.println(name);
        }

        Map<String,Person> persons= applicationContext.getBeansOfType(Person.class);


        System.out.println(persons);

    }



    @Test
    public void testImport(){
        String[] names=applicationContext.getBeanDefinitionNames();

        for (String name:
             names) {
            System.out.println(name);
        }
    }

    @Test
    public void testFactoryBean(){
        String[] names=applicationContext.getBeanDefinitionNames();

        for (String name:
                names) {
            System.out.println(name);
        }

        Object obj=applicationContext.getBean("colorFactoryBean");
        Object objFactory=applicationContext.getBean("&colorFactoryBean");

        System.out.println(obj.getClass());
        System.out.println(objFactory.getClass());
    }


}
