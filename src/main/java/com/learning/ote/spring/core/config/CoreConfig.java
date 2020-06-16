package com.learning.ote.spring.core.config;

import com.learning.ote.spring.core.travel.AutowiredInjectedTravel;
import com.learning.ote.spring.core.travel.ConstructorInjectedTravel;
import com.learning.ote.spring.core.travel.SetterInjectedTravel;
import com.learning.ote.spring.core.vehicle.Bike;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CoreConfig {

    //    Bean declaration
    @Bean(name = "bike")
    public Bike getBike() {
        return new Bike();
    }

    //    @Bean(name = "car")
    //    public Car getCar() {
    //        return new Car();
    //    }

    //    Setter Injection
    @Bean(name = "setterInjectedTravel")
    public SetterInjectedTravel getSetterInjectedTravel() {
        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
        setterInjectedTravel.setVehicle(getBike());
        return setterInjectedTravel;
    }

    //    Constructor Injection
    @Bean(name = "constructorInjectedTravel")
    public ConstructorInjectedTravel getCustomerService() {
        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(getBike());
        return constructorInjectedTravel;
    }

    //    Use autowire with this bean, the same with bean declaration
    @Bean(name = "autowiredInjectedTravel")
    public AutowiredInjectedTravel getAutowiredInjectedTravel() {
        return new AutowiredInjectedTravel();
    }
}
