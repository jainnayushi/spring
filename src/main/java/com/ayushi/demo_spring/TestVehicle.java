package com.ayushi.demo_spring;

import org.springframework.beans.factory.BeanNameAware;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TestVehicle implements BeanNameAware {
    public void drive(){
        System.out.println("Test - Drive");
    }
    @Override
    public void setBeanName (String name){
        System.out.println("setBeanName Called");
    }

    @PostConstruct
    public void postConstruct (){
        System.out.println("postConstruct Called");
    }


}
