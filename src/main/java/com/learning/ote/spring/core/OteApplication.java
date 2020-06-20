package com.learning.ote.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

@SpringBootApplication
public class OteApplication {

    public static void main(String[] args) {
        //load application context
        SpringApplication.run(OteApplication.class, args);

        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.getEnvironment().setActiveProfiles("gr");
        ctx.load("application-context.xml");
        ctx.refresh();

        Travel travel = ctx.getBean("travel", Travel.class);
        travel.startJourney();
        System.out.println("Setting the profile again...");
        ctx.getEnvironment().setActiveProfiles("en");
        ctx.load("application-context.xml");

        travel = ctx.getBean("travel", Travel.class);
        travel.startJourney();
    }

}
