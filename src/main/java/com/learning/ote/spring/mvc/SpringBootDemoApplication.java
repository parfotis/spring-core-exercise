package com.learning.ote.spring.mvc;

import com.learning.ote.spring.mvc.service.AuthorService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AuthorService authorService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("=============================");
		logger.info("====Finding Author by Id====");
		authorService.findAuthor(3L).ifPresent(author -> logger.info(author.toString()));
		logger.info("=============================");
		logger.info("=============================");


		logger.info("=============================");
		logger.info("====Getting all authors====");
		authorService.getAllAuthors().forEach(author -> logger.info(author.toString()));
		logger.info("=============================");
		logger.info("=============================");

		logger.info("=============================");
		logger.info("====Finding Author by first name and last name====");
		authorService.findAuthorByFirstNameAndLastName("Alexandros", "Papadiamantis").ifPresent(author -> logger.info(author.toString()));
		logger.info("=============================");
		logger.info("=============================");

	}
}
