package org.ruchira;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Dev obj = (Dev) context.getBean("dev");  // search is done by name/id
        Dev obj = context.getBean(Dev.class);  // search is done by type
        // in the xml beans every class that is added as a bean will have an object created by spring
//        obj.setAge(21);
        obj.build();
    }
}
