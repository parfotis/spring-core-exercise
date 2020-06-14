package com.learning.ote.spring.core.travel;

import com.learning.ote.spring.core.vehicle.Vehicle;

public class ConstructorInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    //I'm injecting the dependency with through the constructor
    public ConstructorInjectedTravel(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}