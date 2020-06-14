package com.learning.ote.spring.core;

import com.learning.ote.spring.core.vehicle.Vehicle;

public class SetterInjectedTravel {

    //This is the dependency
    private Vehicle myVehicle;

    //I'm injecting the dependency with a setter
    public void setVehicle(Vehicle givenVehicle) {
        myVehicle = givenVehicle;
    }

    public void startJourney() {
        myVehicle.start();
    }

}
