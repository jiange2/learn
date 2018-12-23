package main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args){
        ClassPathXmlApplicationContext appContext =
                new ClassPathXmlApplicationContext("classpath:app-context.xml");
        System.out.println("toString:    " + appContext);
        System.out.println("id:          " + appContext.getId());
        System.out.println("displayName: " + appContext.getDisplayName());
        System.out.println("----------");
        appContext.setBeanName("Test");
        System.out.println("toString:    " + appContext);
        System.out.println("id:          " + appContext.getId());
        System.out.println("displayName: " + appContext.getDisplayName());
    }
}
