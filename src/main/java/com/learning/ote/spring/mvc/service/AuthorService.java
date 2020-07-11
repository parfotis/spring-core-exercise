package com.learning.ote.spring.mvc.service;


import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.domain.entity.AuthorEntity;

import java.util.List;
import java.util.Optional;

public interface AuthorService {

    AuthorDTO findById(Long id);

    List<AuthorEntity> getAllAuthors();

    Optional<AuthorEntity> findAuthorByFirstNameAndLastName(String firstName, String lastName);

    List<AuthorDTO> findAll();

    AuthorDTO save(AuthorDTO authorDTO);

    AuthorDTO update(AuthorDTO authorDTO);

    AuthorDTO deleteById(Long id);

    AuthorEntity convert(AuthorDTO authorDTO);

    List<AuthorDTO> findAll(Optional<String> firstName, Optional<String> lastName, Optional<Integer> limit);
}
