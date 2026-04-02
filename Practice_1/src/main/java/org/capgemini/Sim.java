package org.capgemini;

import org.springframework.stereotype.Component;

@Component
public class Sim {

    private int imsi;
    private String brand;

    public Sim() {
    }

    public int getImsi() {
        return imsi;
    }

    public void setImsi(int imsi) {
        this.imsi = imsi;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void start()
    {
        System.out.println("Sim is activated");
    }

}
