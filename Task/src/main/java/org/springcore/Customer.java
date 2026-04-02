package org.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Properties;

@Component
public class Customer
{
    @Value("Mirudhula")
    private String name;

    @Autowired
    private Order order;

    @Autowired
    private Payment payment;

    public void display() {
        System.out.println("Customer: " + name);
        order.showOrder();
        payment.pay();
    }
}
