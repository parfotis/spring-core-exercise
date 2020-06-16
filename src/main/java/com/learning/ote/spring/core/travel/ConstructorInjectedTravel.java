package com.learning.ote.spring.core.travel;

import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    public ConstructorInjectedTravel(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}