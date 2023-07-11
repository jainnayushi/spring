package com.ayushi.demo_springAOP;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class LoggingAspect {
    // Call loggers before any execution starts
    @Before("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout(..))")
    public void beforeLogger(){
        System.out.println("Logging....");
    }

    // 3. Method as per input
//    @After("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout(..))")
//    public void beforeLogger(JoinPoint jp){
//        System.out.println(jp.getSignature()); /// void com.ayushi.demo_springAOP.ShoppingCart.checkout(String)
//        System.out.println(jp.getArgs()[0]); /// READY
//        System.out.println("Status passed is "+ jp); /// Status passed is execution(void com.ayushi.demo_springAOP.ShoppingCart.checkout(String))
//    }

    //5. Get returned value
    @Pointcut("execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout(..))")
    public void afterReturningPointCut(){
        System.out.println("afterReturningPointCut()");
    }
//    @AfterReturning(value = "execution(* com.ayushi.demo_springAOP.ShoppingCart.checkout(..))", returning = "retVal")
//or
    @AfterReturning(pointcut = "afterReturningPointCut()", returning = "retVal")
    public void afterReturning(int retVal){
        System.out.println("Returned value is " + retVal);
    }



}
