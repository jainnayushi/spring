package com.ayushi.demo_springAOP;

import org.springframework.stereotype.Component;

@Component
public class ShoppingCart {
    // Logging
    // Authentication & Authorization
    // Sanitize the data

//    1. Normal Aspect
//    public void checkout(){
//        System.out.println("Checkout() from ShoppingCart Called");
//    }

//    2. For JointCutPatterns demo
//    public int checkout2() {
//        System.out.println("Checkout2() from ShoppingCart Called");
////        throw new ArithmeticException();
//        return 2;
//    }
//    3. For Input Parameter matching
//    public int checkout(String status) {
//        System.out.println("Checkout(String status) status is "+ status);
//    }

//    4. PointCut creation and calling
    public void checkout(){
        System.out.println("Checkout() from ShoppingCart Called");
    }

//    5. For Input Parameter matching
//    public int checkout() {
//        System.out.println("Checkout() returning");
//        return 1;
//    }
}
