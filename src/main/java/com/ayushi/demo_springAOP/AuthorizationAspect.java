package com.ayushi.demo_springAOP;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthorizationAspect {
    // Create PointCuts - - authentication & authorization
    @Pointcut("within(com.ayushi.demo_springAOP..*)")
    public void pointCut1(){
        System.out.println("PointCut 1");
    }
    @Pointcut("within(com.ayushi.demo_springAOP..*)")
    public void pointCut2(){ System.out.println("PointCut 2"); }

    // Call Point Cuts - authentication
    @Before("pointCut1() && pointCut2()")
    public void callPointCuts(){
        System.out.println("Point Cuts called...");
    }
}
