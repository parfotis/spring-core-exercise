package com.learning.ote.spring.core;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import javax.sql.DataSource;

@SpringBootApplication
public class OteApplication {

    public static void main(String[] args) {
        //load application context
        ApplicationContext ctx = SpringApplication.run(OteApplication.class, args);

        //retrieve bean from spring container
        Travel travel = ctx.getBean("travel", Travel.class);

        travel.startJourney();

        ctx.getBean("dataSource", DataSource.class);

        System.out.println("");
    }

}
