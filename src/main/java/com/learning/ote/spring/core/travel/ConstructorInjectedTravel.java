package com.learning.ote.spring.core.travel;

import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConstructorInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    public ConstructorInjectedTravel(@Qualifier("car") Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection");
    }

    public void startJourney() {
        vehicle.start();
    }

}