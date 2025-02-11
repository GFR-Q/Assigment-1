package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cars car1 = context.getBean("cars2",Cars.class);
        System.out.println(car1.getName());
    }
}