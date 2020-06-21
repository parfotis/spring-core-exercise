package com.learning.ote.spring.core.vehicle;

import com.learning.ote.spring.core.services.LaneAssistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
    @Autowired
    LaneAssistService laneAssistService;

    private String plateNumber;

    public String getPlateNumber() {
        return plateNumber;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    @Override
    public void start() {
        System.out.println("Travel by Car");
        System.out.println(laneAssistService.provideDrivingLane());
    }
}
