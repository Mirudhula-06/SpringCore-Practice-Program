package org.springcore;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("veg")
@Scope("prototype")
public class Vegetable {

    public Vegetable()
    {
        System.out.println("Vegetable object is created");
    }

}
