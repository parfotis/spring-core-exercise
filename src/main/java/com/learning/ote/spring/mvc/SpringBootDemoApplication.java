package com.learning.ote.spring.mvc;

import com.learning.ote.spring.mvc.configuration.AppConfiguration;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class SpringBootDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfiguration.class);
		ModelMapper modelMapper = (ModelMapper) context.getBean("modelMapper");
	}
}
