package org.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(myConfig.class);
        Test t = (Test)context.getBean("t");
        t.parent.start();
    }
}