package com.learning.ote.spring.core.vehicle;

import com.learning.ote.spring.core.annotation.BeanAnnotation;

@BeanAnnotation(name = "car")
public class Car implements Vehicle {
    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void start() {
        System.out.println("Travel by Car");
    }

}
