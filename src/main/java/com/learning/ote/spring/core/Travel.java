package com.learning.ote.spring.core;

import com.learning.ote.spring.core.services.LaneAssistService;
import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Travel {

    @Autowired
    @Qualifier("bikeVehicle")
    Vehicle vehicle;

    @Autowired
    LaneAssistService laneAssistService;


    public void startJourney() {
        vehicle.start();
        laneAssistService.provideDrivingLane();
    }

}