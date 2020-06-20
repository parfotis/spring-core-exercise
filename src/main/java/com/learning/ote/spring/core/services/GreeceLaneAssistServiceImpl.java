package com.learning.ote.spring.core.services;

import com.learning.ote.spring.core.enums.DrivingLane;

public class GreeceLaneAssistServiceImpl implements LaneAssistService {

    @Override
    public void provideDrivingLane() {
        System.out.println("Drive in " + DrivingLane.RIGHT.name() + " lane");
    }

}
