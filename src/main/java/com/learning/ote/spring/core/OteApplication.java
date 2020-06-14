package com.learning.ote.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.learning.ote.spring.core.travel.*;

@SpringBootApplication
public class OteApplication {

    public static void main(String[] args) {
        SpringApplication.run(OteApplication.class, args);

        //We will just take ask for an instance of each bean from the Application Context.
        ApplicationContext ctx = new ClassPathXmlApplicationContext("application-context.xml");

        AutowiredInjectedTravel autowiredInjectedTravel = (AutowiredInjectedTravel) ctx.getBean("autowiredInjectedTravel");
        autowiredInjectedTravel.startJourney();

        ConstructorInjectedTravel constructorInjectedTravel = (ConstructorInjectedTravel) ctx.getBean("constructorInjectedTravel");
        constructorInjectedTravel.startJourney();

        SetterInjectedTravel setterInjectedTravel = (SetterInjectedTravel) ctx.getBean("setterInjectedTravel");
        setterInjectedTravel.startJourney();

    }

}
