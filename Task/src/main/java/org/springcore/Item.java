package org.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Item {
    @Value("Laptop")
    private String name;

    @Value("50000")
    private double price;

    @Override
    public String toString() {
        return name + " : " + price;
    }
}
