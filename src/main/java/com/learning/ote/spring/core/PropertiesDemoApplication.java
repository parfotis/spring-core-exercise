package com.learning.ote.spring.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;
import org.springframework.test.context.ActiveProfiles;

@SpringBootApplication
@ImportResource(locations = {"classpath:application-context.xml", "classpath:another-application-context.xml"})
public class PropertiesDemoApplication implements CommandLineRunner {

    @Value("${key.something}")
    private String injectedProperty;

    public static void main(String[] args) {
        SpringApplication.run(PropertiesDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("value injected via @Value:" + injectedProperty);

    }
}
