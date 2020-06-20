package com.learning.ote.spring.core;

import com.learning.ote.spring.core.services.LaneAssistService;
import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Travel {

    Vehicle vehicle;

    @Autowired
    LaneAssistService laneAssistService;

    @Autowired
    public Travel(@Qualifier("bikeVehicle") Vehicle vehicle) {
        this.vehicle = vehicle;
    }


    public void startJourney() {
        vehicle.start();
        laneAssistService.provideDrivingLane();
    }

}