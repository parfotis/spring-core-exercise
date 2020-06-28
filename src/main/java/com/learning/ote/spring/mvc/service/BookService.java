package com.learning.ote.spring.mvc.service;

import com.learning.ote.spring.mvc.domain.Author;
import com.learning.ote.spring.mvc.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    Optional<Book> findBook(Long id);

    List<Book> findAll();

    List<Book> findByAuthor(Author author);

    List<Book> findByAuthorAndYear(Author author, String year);

    List<Book> findByTitle(String title);


}
