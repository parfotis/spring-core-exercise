package com.learning.ote.spring.core;

import com.learning.ote.spring.core.annotation.ComponentScan;
import com.learning.ote.spring.core.vehicle.Bike;
import com.learning.ote.spring.core.vehicle.Car;
import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class OteApplication {

    public static void main(String[] args) {
        SpringApplication.run(OteApplication.class, args);
        GenericApplicationContext context = new GenericApplicationContext();

        ComponentScan componentScan = new ComponentScan(context);
        componentScan.parse("com.learning.ote.spring.core.vehicle");

        Vehicle car = context.getBean("car", Car.class);
        car.start();

        Vehicle bike = context.getBean("bike", Bike.class);
        bike.start();
    }

}
