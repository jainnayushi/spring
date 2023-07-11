package com.ayushi.demo_springAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext factory = new AnnotationConfigApplicationContext(BeanConfig.class);
        ShoppingCart cart = factory.getBean(ShoppingCart.class);
//        1. Normal Aspect call
//        cart.checkout();
//        2. Joint point patterns
//        int x = cart.checkout2();
//        3. Component Params
//        cart.checkout("READY");
//        4. PointCut creation and calling - ???
        cart.checkout();
//        5. Returning
//        cart.checkout();



    }
}
