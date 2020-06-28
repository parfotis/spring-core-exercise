package com.learning.ote.spring.mvc.service;

import com.learning.ote.spring.mvc.domain.Author;
import com.learning.ote.spring.mvc.domain.Book;
import com.learning.ote.spring.mvc.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    @Override
    public Optional<Book> findBook(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public List<Book> findByAuthor(Author author) {
        return bookRepository.findByAuthor(author);
    }

    @Override
    public List<Book> findByAuthorAndYear(Author author, String year) {
        return bookRepository.findByAuthorAndYear(author, year);
    }

    @Override
    public List<Book> findByTitle(String title) {
        return bookRepository.findByTitleContaining(title);
    }


}
