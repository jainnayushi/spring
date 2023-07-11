package com.ayushi.demo_spring;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Tyre {
//    @Value("Ceat1")
    @Value("${tyre.brand}")
    private String brand;

//    public Tyre(String brand) {
//        this.brand = brand;
//    }

    public String getBrand() {
        return brand;
    }

//    @Value("Ceat2")
    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String toString(){
        return "Tyre - " + brand;
    }

    public String brandPrint(){
        return brand;
    }
}
