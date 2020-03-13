package com.learning.ote.spring.core;

import com.learning.ote.spring.core.vehicle.Car;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class OteApplication {

    public static void main(String[] args) {
        SpringApplication.run(OteApplication.class, args);

        Travel myTravel = new Travel();
        myTravel.setVehicle(new Car());
        myTravel.startJourney();
    }

}
