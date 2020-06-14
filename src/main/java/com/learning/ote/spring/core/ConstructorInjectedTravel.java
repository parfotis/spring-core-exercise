package com.learning.ote.spring.core;

import com.learning.ote.spring.core.vehicle.Vehicle;

public class ConstructorInjectedTravel {
    //This is the dependency
    private Vehicle myVehicle;

    //I'm injecting the dependency with through the constructor
    public ConstructorInjectedTravel(Vehicle myVehicle) {
        this.myVehicle = myVehicle;
    }

    public void startJourney() {
        myVehicle.start();
    }
}
