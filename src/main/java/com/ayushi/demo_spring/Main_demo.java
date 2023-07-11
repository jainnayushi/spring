package com.ayushi.demo_spring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main_demo {
    public static void main(String[] args) {
//        1. With "new" keyword - 2 dependency
//        Car obj = new Car();
//        2. With "new" - 1 dependency
//        Vehicle obj = new Car();
//        3. XML Based Confi with "getBean() + ApplicationContext + <bean>" - Loosely coupled
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Vehicle obj = (Vehicle) context.getBean("car");
//        obj.drive();
//        4. Annotation Based Confi with "getBean() + ApplicationContext" + @component + <context:comp scan>
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Vehicle obj = (Vehicle) context.getBean("car");
//        obj.drive(); /// Car - Drive
//        5. Get value using Setter Injection - property and @Value
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t); /// Tyre - MRF
//        6. Get value using Constructor Injection
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Tyre t = (Tyre) context.getBean("tyre");
//        System.out.println(t); /// Tyre - MRF
//        7. Autowired Annotation obj-drive-tyre-tostring of Tyre : Tyre-Scooty
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Tyre t = (Tyre) context.getBean("tyre");
//        Vehicle obj = (Vehicle) context.getBean("scooty");
//        obj.drive(); /// Scooty - Drive - null without autowired /// Scooty - Drive - Tyre - MRF
//        8. Object Injection : 1. autowire 2. ref 3. @AutoWired
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
//        Engine c = (Engine) context.getBean("engine");
//        Vehicle obj = (Vehicle) context.getBean("cycle");
//        obj.drive();
//        9. Annotation Based configuration
//        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//        Vehicle obj = factory.getBean(Car.class);
//        obj.drive();
//        10. Spring Bean Scope - Default Singleton, @Scope(scopeName = "prototype")
//        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//        Tyre t = factory.getBean(Tyre.class);
//        t.setBrand("Ceat");
//        System.out.println(t); /// Tyre - Ceat - Singleton, Tyre - Ceat - prototype
//        Tyre t2 = factory.getBean(Tyre.class);
//        System.out.println(t2); /// Tyre - Ceat - Singleton, Tyre - null - prototype
//        11. Spring Life Cycle
//        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
//        TestVehicle obj = factory.getBean(TestVehicle.class);
//        obj.drive();
////        setBeanName Called
////        postConstruct Called
////        Test - Drive
//        12. Annotation Only - Ferrari-Tyre
        ApplicationContext factory = new AnnotationConfigApplicationContext(AppConfig.class);
        Ferrari obj = factory.getBean(Ferrari.class);
        obj.drive();
        System.out.println("Driver - " + obj.driver);
        System.out.println("Tyre Brand - " + obj.tyre.brandPrint());


    }
}
