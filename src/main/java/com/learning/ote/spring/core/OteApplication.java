package com.learning.ote.spring.core;

import com.learning.ote.spring.core.config.CoreConfiguration;
import com.learning.ote.spring.core.vehicle.Car;
import com.learning.ote.spring.core.vehicle.Vehicle;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class OteApplication {

    public static void main(String[] args) {
        SpringApplication.run(OteApplication.class, args);
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CoreConfiguration.class);

        Vehicle car = context.getBean("car", Car.class);
        car.start();
    }

}
