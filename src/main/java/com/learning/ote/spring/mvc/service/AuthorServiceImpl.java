package com.learning.ote.spring.mvc.service;

import com.learning.ote.spring.mvc.domain.Author;
import com.learning.ote.spring.mvc.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;

    @Override
    public List<Author> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public Optional<Author> findAuthor(Long id) {
        return authorRepository.findById(id);
    }

    @Override
    public Optional<Author> findAuthorByFirstNameAndLastName(String firstName, String lastName) {
        return authorRepository.findAuthorByFirstNameAndLastName(firstName, lastName);
    }


}
