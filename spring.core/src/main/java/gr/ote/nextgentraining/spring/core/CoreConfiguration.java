package gr.ote.nextgentraining.spring.core;

import gr.ote.nextgentraining.spring.core.entities.Car;
import gr.ote.nextgentraining.spring.core.entities.MotorBike;
import gr.ote.nextgentraining.spring.core.entities.User;
import gr.ote.nextgentraining.spring.core.entities.Vehicle;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.List;

@Configuration
public class CoreConfiguration {
    @Bean
    @Primary
    @Qualifier
    public Vehicle car(){
        return new Car();
    }
    
    @Bean
    @Qualifier
    public Vehicle motorBike(){
        return new MotorBike();
    }

    @Bean
    public User user(){
        return new User();
    }
}
