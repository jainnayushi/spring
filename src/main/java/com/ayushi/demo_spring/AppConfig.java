package com.ayushi.demo_spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.ayushi.demo_spring")
@PropertySource("classpath:info")
public class AppConfig {
}
