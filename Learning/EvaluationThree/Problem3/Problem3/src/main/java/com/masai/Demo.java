package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Demo {
    public static void main(String[] args) {
    	
    	ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        PersonService a1 = ctx.getBean("personService", PersonService.class);
        a1.printMap();
        a1.printList();
        a1.printAppName();

    }
}
