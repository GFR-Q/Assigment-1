package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Owners {
    private String Name= "Rakhat";

    @Autowired
    private Cars cars;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public Cars getCars() {
        return cars;
    }

    public void setCars(Cars cars) {
        this.cars = cars;
    }
}
