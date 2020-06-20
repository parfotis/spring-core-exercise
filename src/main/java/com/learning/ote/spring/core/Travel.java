package com.learning.ote.spring.core;

import com.learning.ote.spring.core.services.LaneAssistService;
import com.learning.ote.spring.core.vehicle.Vehicle;

public class Travel {

    Vehicle vehicle;

    LaneAssistService laneAssistService;

    public Travel(Vehicle vehicle, LaneAssistService laneAssistService) {
        this.vehicle = vehicle;
        this.laneAssistService = laneAssistService;
    }


    public void startJourney() {
        vehicle.start();
        laneAssistService.provideDrivingLane();
    }

}