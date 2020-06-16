package com.learning.ote.spring.core.travel;

import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//This annotation is needed to tell spring that this is a bean
@Component
public class AutowiredInjectedTravel {

    //This is the dependency
    //No setter or constructor is needed
    @Autowired
    private Vehicle vehicle;

    public void startJourney() {
        vehicle.start();
    }

    //Autowire by constructor will be preferred by Spring if both setter and constructor are present
//    public AutowiredInjectedTravel(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Using Constructor Injection - Autowired");
//    }

//    public void setVehicle(Vehicle vehicle) {
//        this.vehicle = vehicle;
//        System.out.println("Using Setter Injection - Autowired");
//    }

}