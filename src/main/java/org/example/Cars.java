package org.example;

import org.springframework.stereotype.Component;

@Component
public class Cars {
    private String name= "BMW";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    @Override
     public String toString() {
        return "Cars: "+name;
     }
}
