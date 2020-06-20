package com.learning.ote.spring.core.services;

import com.learning.ote.spring.core.enums.DrivingLane;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("en")
public class GreatBritainLaneAssistServiceImpl implements LaneAssistService {

    @Override
    public void provideDrivingLane() {
        System.out.println("Drive in " + DrivingLane.LEFT.name() + " lane");
    }
}
