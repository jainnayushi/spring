package com.ayushi.demo_spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Car implements Vehicle{
    public void drive(){
        System.out.println("Car - Drive ");
    }
}
