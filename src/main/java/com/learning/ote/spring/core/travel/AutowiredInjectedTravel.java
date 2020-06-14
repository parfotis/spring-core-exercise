package com.learning.ote.spring.core.travel;

import com.learning.ote.spring.core.vehicle.Vehicle;

public class AutowiredInjectedTravel {

    //This is the dependency
    private Vehicle vehicle;

    public void setVehicle(Vehicle vehicle) {
        //To Autowire byType or byName I need to have at my class a public setter method
        this.vehicle = vehicle;
        System.out.println("Using Setter Injection - Autowired");
    }

    public void startJourney() {
        vehicle.start();
    }

    //To Autowire by Constructor I need to have at my class the appropriate public constructor
    //Autowire by constructor will be preferred by Spring if both setter and constructor are present
    /*
    public AutowiredInjectedTravel(Vehicle vehicle) {
        this.vehicle = vehicle;
        System.out.println("Using Constructor Injection - Autowired");
    }
    */

}