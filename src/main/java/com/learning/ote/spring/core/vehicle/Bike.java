package com.learning.ote.spring.core.vehicle;

import com.learning.ote.spring.core.annotation.BeanAnnotation;
import org.springframework.stereotype.Component;

@BeanAnnotation(name = "bike")
public class Bike implements Vehicle {

    @Override
    public void start() {
        System.out.println("Travel by Bike");
    }

}
