package com.learning.ote.spring.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@SpringBootApplication
@PropertySource("classpath:foo.properties")
public class PropertiesDemoApplication implements CommandLineRunner {

    //this is loaded from application.properties
    @Value("${default.file.property}")
    private String injectedFromDefaultFile;

    //this is loaded from config via current @PropertySource annotated class
    @Value("${key.something}")
    private String injectedProperty;

    //this is loaded from config via PropertiesConfig @PropertySource annotated class
    @Value("${bar.property1}")
    private String injectedProperty2;

    @Autowired
    private Environment env;

    public static void main(String[] args) {
        SpringApplication.run(PropertiesDemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        System.out.println("In main app value injected from default file via @Value:" + injectedFromDefaultFile);
        System.out.println("In main app value injected from default file via Environment:" + env.getProperty("default.file.property"));

        System.out.println("In main app value injected via @Value:" + injectedProperty);
        System.out.println("In main app value injected via Environment:" + env.getProperty("key.something"));

        System.out.println("In main app value injected from @Configuration class via @Value:" + injectedProperty2);
        System.out.println("In main app value injected from @Configuration class via Environment:" + env.getProperty("bar.property1"));
    }
}
