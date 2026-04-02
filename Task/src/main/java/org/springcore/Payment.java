package org.springcore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("product")
public class Payment {
    private String type;
    private double amount;

    public Payment(@Value("UPI") String type,
                   @Value("70000") double amount) {
        this.type = type;
        this.amount = amount;
    }

    public void pay() {
        System.out.println(type + " payment of " + amount);
    }
}
