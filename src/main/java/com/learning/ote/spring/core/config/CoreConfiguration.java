package com.learning.ote.spring.core.config;

import com.learning.ote.spring.core.vehicle.Bike;
import com.learning.ote.spring.core.vehicle.Car;
import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfiguration {

    @Bean
    public Vehicle car() {
        return new Car();
    }


    @Bean
    public Vehicle bike() {
        return new Bike();
    }
}
