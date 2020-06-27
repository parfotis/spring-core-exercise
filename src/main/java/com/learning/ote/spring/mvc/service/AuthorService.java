package com.learning.ote.spring.mvc.service;


import com.learning.ote.spring.mvc.domain.Author;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    Optional<Author> findAuthor(Long id);

    List<Author> getAllAuthors();

    Optional<Author> findAuthorByFirstNameAndLastName(String firstName, String lastName);

}
