package com.learning.ote.spring.mvc.converter;

import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.domain.entity.AuthorEntity;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

public class AuthorConverter {

    @Autowired
    private ModelMapper mapper;

    public AuthorConverter(){
        this.mapper = new ModelMapper();
    }

    public AuthorConverter(ModelMapper mapper){
        this.mapper = mapper;
    }

    public AuthorDTO convert(AuthorEntity author) {
        return mapper.map(author, AuthorDTO.class);
    }

    public AuthorEntity convert(AuthorDTO authorDTO) {
        return mapper.map(authorDTO, AuthorEntity.class);
    }
}
