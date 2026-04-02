package org.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ConfigurableApplicationContext context= new AnnotationConfigApplicationContext(myConfig.class);
        Book b = (Book)context.getBean("book");
        System.out.println("Book Name :" + b.getName());
        System.out.println("Book Price :" + b.getPrice());

    }
}