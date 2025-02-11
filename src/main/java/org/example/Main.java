package org.example;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Cars carOne = context.getBean(Cars.class);
        System.out.println(carOne.getName());
    }
}