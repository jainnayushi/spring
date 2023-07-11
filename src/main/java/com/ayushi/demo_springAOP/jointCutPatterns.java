package com.ayushi.demo_springAOP;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class jointCutPatterns {
    @Before("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout2())")
    public void before(){
        System.out.println("before()");
    }
    @After("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout2())")
    public void after(){
        System.out.println("after()");
    }
    @AfterThrowing("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout2())")
    public void afterThrowing(){
        System.out.println("afterThrowing()");
    }
    @AfterReturning("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout2())")
    public void afterReturning(){
        System.out.println("afterReturning()");
    }
//    @Around("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout2())")
//    public void around(){
//        System.out.println("around()");
//    }
}
//    before()
//    Checkout2() from ShoppingCart Called
//    afterReturning()
//    after()