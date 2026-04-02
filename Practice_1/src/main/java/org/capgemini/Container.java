package org.capgemini;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Container {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = new AnnotationConfigApplicationContext(myConfig.class);
        Phone myphone = (Phone)context.getBean("myPhone");
        myphone.call();
    }
}
