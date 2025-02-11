package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cars car = context.getBean("cars2",Cars.class);
        Owners owner = context.getBean(Owners.class);
        System.out.println("First Car: "+car.getName());
        System.out.println("Owner: "+owner.getName());
    }
}