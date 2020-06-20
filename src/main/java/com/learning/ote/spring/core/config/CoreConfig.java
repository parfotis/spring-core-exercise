package com.learning.ote.spring.core.config;

import com.learning.ote.spring.core.vehicle.Bike;
import com.learning.ote.spring.core.vehicle.Car;
import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan("com.learning.ea.spring.core")
public class CoreConfig {

    @Bean
    public Vehicle carVehicle() {
        return new Car();
    }

    @Bean
    public Vehicle bikeVehicle() {
        return new Bike();
    }
}

