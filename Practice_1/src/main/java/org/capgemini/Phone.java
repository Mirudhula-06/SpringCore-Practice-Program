package org.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("myPhone")
public class Phone {

    private String brand;
    private int price;

    @Autowired
    private Sim sim;

    public Phone() {
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Sim getSim() {
        return sim;
    }

    public void setSim(Sim sim) {
        this.sim = sim;
    }

    public void call()
    {
        sim.start();
        System.out.println("IM CALLING TO MY BEST FRIEND USING MYPHONE");
    }

}
