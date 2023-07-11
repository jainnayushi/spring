package com.ayushi.demo_springAOP;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan(basePackages = "com.ayushi.demo_springAOP")
@EnableAspectJAutoProxy
public class BeanConfig {
}
