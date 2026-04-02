package org.springcore;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        ConfigurableApplicationContext context=new AnnotationConfigApplicationContext(myConfig.class);

        Fruit f1 = context.getBean(Fruit.class);
        Fruit f2 = context.getBean(Fruit.class);

        //Singleton
        //object reference will be created only one and it always returns the same refrence
        System.out.println(f1);
        System.out.println(f2);

        Vegetable v1= context.getBean(Vegetable.class);
        Vegetable v2= context.getBean(Vegetable.class);

        //prototype
        //Everytime new object will be created
        System.out.println(v1);
        System.out.println(v2);

    }
}