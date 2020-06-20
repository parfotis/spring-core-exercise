package com.learning.ote.spring.core.services;

import com.learning.ote.spring.core.enums.DrivingLane;

public class GreatBritainLaneAssistServiceImpl implements LaneAssistService {

    @Override
    public void provideDrivingLane() {
        System.out.println("Drive in " + DrivingLane.LEFT.name() + " lane");
    }
}
