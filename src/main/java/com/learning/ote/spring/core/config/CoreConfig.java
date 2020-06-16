package com.learning.ote.spring.core.config;

import com.learning.ote.spring.core.vehicle.Bike;
import com.learning.ote.spring.core.vehicle.Car;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class CoreConfig {

    //    Bean declaration
    @Bean(name = "bike")
    public Bike getBike() {
        return new Bike();
    }

    //    Bean declaration
    @Bean(name = "car")
    @Primary
    public Car getCar() {
        Car car = new Car();
        car.setPlateNumber("ZHI-6344");
        return car;
    }

    //    //    Setter Injection
    //    @Bean(name = "setterInjectedTravel")
    //    public SetterInjectedTravel getSetterInjectedTravel() {
    //        SetterInjectedTravel setterInjectedTravel = new SetterInjectedTravel();
    //        setterInjectedTravel.setVehicle(getBike());
    //        return setterInjectedTravel;
    //    }
    //
    //    //    Constructor Injection
    //    @Bean(name = "constructorInjectedTravel")
    //    public ConstructorInjectedTravel getCustomerService() {
    //        ConstructorInjectedTravel constructorInjectedTravel = new ConstructorInjectedTravel(getBike());
    //        return constructorInjectedTravel;
    //    }
    //
    //    //    Use autowire with this bean, the same with bean declaration
    //    @Bean(name = "autowiredInjectedTravel")
    //    public AutowiredInjectedTravel getAutowiredInjectedTravel() {
    //        return new AutowiredInjectedTravel();
    //    }
}
