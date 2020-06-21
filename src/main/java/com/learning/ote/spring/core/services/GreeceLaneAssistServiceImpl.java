package com.learning.ote.spring.core.services;

import com.learning.ote.spring.core.enums.DrivingLane;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile("gr")
@Primary
public class GreeceLaneAssistServiceImpl implements LaneAssistService {

    @Override
    public String provideDrivingLane() {
        return "Drive in " + DrivingLane.RIGHT.name() + " lane";
    }

}
