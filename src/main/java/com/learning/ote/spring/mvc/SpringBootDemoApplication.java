package com.learning.ote.spring.mvc;

import com.learning.ote.spring.mvc.domain.Author;
import com.learning.ote.spring.mvc.service.AuthorService;
import com.learning.ote.spring.mvc.service.BookService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Optional;

@SpringBootApplication
public class SpringBootDemoApplication implements CommandLineRunner {

	private final Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private AuthorService authorService;

	@Autowired
	private BookService bookService;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("=============================");
		logger.info("====Finding Author by Id====");
		Optional<Author> foundAuthor = authorService.findAuthor(3L);
		foundAuthor.ifPresent(author -> logger.info(author.toString()));
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


		logger.info("=============================");
		logger.info("====Finding Book by Id====");
		bookService.findBook(3L).ifPresent(book -> logger.info(book.toString()));
		logger.info("=============================");
		logger.info("=============================");

		logger.info("=============================");
		logger.info("====Getting all books====");
		bookService.findAll().forEach(book -> logger.info(book.toString()));
		logger.info("=============================");
		logger.info("=============================");
		// Carefull with unique constraint in Author entity for first-last name columns
		/*logger.info("====Saving new Author====");
		Author author = new Author();
		author.setFirstName("Stelios");
		author.setLastName("Matthaios");

		logger.info("=============================");
		logger.info("====Finding Books by author====");
		foundAuthor.ifPresent(author -> bookService.findByAuthor(author).forEach(book -> logger.info(book.toString())));
		logger.info("=============================");
		logger.info("=============================");

		logger.info("=============================");
		logger.info("====Finding Book by title====");
		bookService.findByTitle("The").forEach(book -> logger.info(book.toString()));
		logger.info("=============================");
		logger.info("=============================");*/
	}
}
