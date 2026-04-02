package org.springcore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.*;

@Component("order")
public class Order {

    @Autowired
    private List<Item> items;
    private Set<String> categories;
    private Map<String, Double> discounts;

    public Order() {
        items = new ArrayList<>();
        categories = new HashSet<>();
        categories.add("Electronics");
        categories.add("Gadgets");

        discounts = new HashMap<>();
        discounts.put("Laptop", 10.0);
        discounts.put("Mobile", 5.0);
    }

    public void showOrder() {
        System.out.println(items);
        System.out.println(categories);
        System.out.println(discounts);
    }
}
