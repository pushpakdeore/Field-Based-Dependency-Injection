package org.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car {

    @Autowired
    private Engine engine;

    public void drive() {
        System.out.println("Car is driving...");
        System.out.println(engine.start());
    }
}