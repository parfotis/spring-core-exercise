package com.learning.ote.spring.mvc.controller;

import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/")
    public ResponseEntity<List<AuthorDTO>> findAll() {
        List<AuthorDTO> authorDTOList = authorService.findAll(Optional.empty(), Optional.empty(), Optional.empty());
        return ResponseEntity.status((authorDTOList == null || authorDTOList.isEmpty()) ? HttpStatus.NOT_FOUND : HttpStatus.OK).body(authorDTOList);
    }

    @GetMapping("")
    public ResponseEntity<List<AuthorDTO>> findTopByFirstnameLastname(
            @Valid @RequestParam(name = "firstName", required = false) String firstName,
            @Valid @RequestParam(name = "lastName", required = false) String lastName,
            @Valid @RequestParam(name = "limit", required = false) Integer limit) {

        List<AuthorDTO> authorDTOList =  authorService.findAll(Optional.ofNullable(firstName), Optional.ofNullable(lastName), Optional.ofNullable(limit));
        return ResponseEntity.status((authorDTOList == null || authorDTOList.isEmpty()) ? HttpStatus.NOT_FOUND : HttpStatus.OK).body(authorDTOList);

    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> findById(@Valid @PathVariable("id") Long authorId) {
        AuthorDTO authorRes = authorService.findById(authorId);

        return ResponseEntity
                .status((authorRes != null) ? HttpStatus.OK : HttpStatus.NOT_FOUND)
                .body(authorRes);
    }

    @PostMapping
    public ResponseEntity<AuthorDTO> create(@Valid @RequestBody AuthorDTO authorDTO) {
        AuthorDTO authorRes = authorService.save(authorDTO);
        return ResponseEntity.status((authorRes == null) ? HttpStatus.UNPROCESSABLE_ENTITY : HttpStatus.OK).body(authorRes);
    }

    @PutMapping
    public ResponseEntity<AuthorDTO> update(@Valid @RequestBody AuthorDTO authorDTO) {
        AuthorDTO authorRes = authorService.update(authorDTO);
        return ResponseEntity.status((authorRes == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK).body(authorRes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<AuthorDTO> deleteById(@Valid @PathVariable("id") Long authorId) {
        AuthorDTO authorRes = authorService.deleteById(authorId);
        return ResponseEntity.status((authorRes == null) ? HttpStatus.NOT_FOUND : HttpStatus.OK).body(authorRes);
    }

    @ResponseStatus(HttpStatus.NOT_FOUND)
    public String handleNotFoundException(){
        return "resource not found";
    }

}
