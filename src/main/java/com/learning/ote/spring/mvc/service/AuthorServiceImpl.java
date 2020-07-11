package com.learning.ote.spring.mvc.service;

import com.learning.ote.spring.mvc.converter.AuthorConverter;
import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.domain.entity.AuthorEntity;
import com.learning.ote.spring.mvc.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
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
    public AuthorDTO findById(Long id) {
        return authorConverter.convert(authorRepository.findById(id).get());
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

    @Override
    public AuthorDTO save(AuthorDTO authorDTO) {
        authorRepository.save(authorConverter.convert(authorDTO));

        return authorDTO;
    }

    @Override
    public AuthorDTO update(AuthorDTO authorDTONew) {
        AuthorDTO authorDTOOrig = authorRepository.findById(authorDTONew.getId())
                .filter(ae -> ae.getId() != null)
                .map(ae -> {return authorConverter.convert(ae);})
                .orElse(null);
        if(authorDTOOrig != null){
            authorRepository.save(authorConverter.convert(authorDTONew));
        }
        else{
            authorDTONew = null;
        }
        return authorDTONew;
    }

    @Override
    public AuthorDTO deleteById(Long id) {
        AuthorDTO authorDTO = authorRepository.findById(id)
                .map(ae -> {return authorConverter.convert(ae);})
                .orElse(null);
        if(authorDTO != null){
            authorRepository.deleteById(authorDTO.getId());
        }
        return authorDTO;
    }

    @Override
    public AuthorEntity convert(AuthorDTO authorDTO) {
        return authorConverter.convert(authorDTO);
    }

    @Override
    public List<AuthorDTO> findTopByLastname(Integer limit) {
        return authorRepository.findAll(PageRequest.of(0, limit, Sort.by(Sort.Direction.ASC, "lastName"))).stream()
                .map(ae -> {return authorConverter.convert(ae);})
                .collect(Collectors.toList());
    }


}
