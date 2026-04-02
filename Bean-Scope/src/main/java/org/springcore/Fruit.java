package org.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("fruit")
@Scope("singleton") //By Default it is singleton

public class Fruit {

    public Fruit() {
        System.out.println("Fruit object created");
    }

    public void show() {
        System.out.println("I am a fruit");
    }
}
