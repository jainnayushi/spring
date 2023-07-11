package com.ayushi.demo_spring;

import org.springframework.beans.factory.annotation.Autowired;

public class Cycle implements Vehicle{
    @Autowired

    Engine engine;

    public Cycle(Engine engine) {
        this.engine = engine;
        System.out.println("Engine - Constructor");
    }

    public void drive(){
        System.out.println("Cycle - Drive ");
        engine.start();
    }

}
