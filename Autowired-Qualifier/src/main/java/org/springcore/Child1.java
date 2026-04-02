package org.springcore;

import org.springframework.stereotype.Component;

@Component("child1")
public class Child1 implements Parent{

    @Override
    public void start() {
        System.out.println("I'm child 1 implementing parent class");
    }
}
