package com.learning.ote.spring.core.travel;

import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class AutowiredInjectedTravel {

    //This is the dependency
    //No setter or constructor is needed
    //We need this annotation here to know where to Autowire
    @Autowired
    @Qualifier("bike")
    private Vehicle vehicle;

    public void startJourney() {
        vehicle.start();
    }

}