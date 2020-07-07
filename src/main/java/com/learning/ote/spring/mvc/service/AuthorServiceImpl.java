package com.learning.ote.spring.mvc.service;

import com.learning.ote.spring.mvc.converter.AuthorConverter;
import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.domain.entity.AuthorEntity;
import com.learning.ote.spring.mvc.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class AuthorServiceImpl implements AuthorService{

    @Autowired
    private AuthorRepository authorRepository;
    private AuthorConverter authorConverter;

    public AuthorServiceImpl(){
        this.authorConverter = new AuthorConverter();
    }

    @Override
    public List<AuthorEntity> getAllAuthors() {
        return authorRepository.findAll();
    }

    @Override
    public AuthorEntity findById(Long id) {
        AuthorEntity authorEntity = authorRepository.findById(id).get();
        return authorEntity;
    }

    @Override
    public Optional<AuthorEntity> findAuthorByFirstNameAndLastName(String firstName, String lastName) {
        return authorRepository.findAuthorByFirstNameAndLastName(firstName, lastName);
    }

    @Override
    public List<AuthorDTO> findAll() {
        return authorRepository.findAll().stream()
                .map(ae -> {return authorConverter.convert(ae);})
                .collect(Collectors.toList());
    }


}
