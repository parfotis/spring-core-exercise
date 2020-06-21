package com.learning.ote.spring.core.vehicle;

import com.learning.ote.spring.core.services.LaneAssistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle {

    @Autowired
    LaneAssistService laneAssistService;

    public void start() {
        System.out.println("Travel by Bike");
        System.out.println(laneAssistService.provideDrivingLane());
    }
}
