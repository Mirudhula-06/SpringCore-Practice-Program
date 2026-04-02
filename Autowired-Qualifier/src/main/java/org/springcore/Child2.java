package org.springcore;

import org.springframework.stereotype.Component;

@Component("child2")
public class Child2 implements Parent{


    @Override
    public void start() {
        System.out.println("I'M CHILD 2 IMPLEMENTING PARENT CLASS");
    }
}
