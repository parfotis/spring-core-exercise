package com.learning.ote.spring.core.vehicle;

public class Car implements Vehicle {
    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void start() {
        System.out.println("Travel by Car");
    }

}
