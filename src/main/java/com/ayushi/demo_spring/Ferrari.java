package com.ayushi.demo_spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ferrari implements Vehicle{

    @Autowired
    Tyre tyre;

    @Value("${ferrari.driver}")
    String driver;

    @Override
    public void drive() {
        System.out.println("Ferrari - Drive");
    }
}
