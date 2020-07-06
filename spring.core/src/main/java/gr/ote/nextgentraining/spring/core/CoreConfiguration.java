package gr.ote.nextgentraining.spring.core;

import gr.ote.nextgentraining.spring.core.entities.Car;
import gr.ote.nextgentraining.spring.core.entities.MotorBike;
import gr.ote.nextgentraining.spring.core.entities.User;
import gr.ote.nextgentraining.spring.core.entities.Vehicle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfiguration {
    @Bean
    public Vehicle car(){
        return new Car();
    }

    @Bean
    public Vehicle motorBike(){
        return new MotorBike();
    }

    @Bean
    public User user(){
        return new User();
    }
}
