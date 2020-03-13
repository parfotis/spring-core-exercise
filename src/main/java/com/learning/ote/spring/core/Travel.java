package com.learning.ote.spring.core;

import com.learning.ote.spring.core.vehicle.Vehicle;

public class Travel {
    Vehicle vehicle;

    public void startJourney() {
        vehicle.start();
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }
}
