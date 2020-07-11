package com.learning.ote.spring.mvc.controller;

import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/")
    public List<AuthorDTO> findAll() {
        return authorService.findAll();
    }

    @GetMapping("")
    public List<AuthorDTO> findTopByFirstnameLastname(
            @RequestParam(name = "firstName", required = false) String firstName,
            @RequestParam(name = "lastName", required = false) String lastName,
            @RequestParam(name = "limit", required = false) Integer limit) {

        return authorService.findAll(Optional.ofNullable(firstName), Optional.ofNullable(lastName), Optional.ofNullable(limit));
    }

    @GetMapping("/{id}")
    public ResponseEntity<AuthorDTO> findById(@PathVariable("id") Long authorId) {
        AuthorDTO authorDTO = authorService.findById(authorId);

        return ResponseEntity
                .status((authorDTO != null) ? HttpStatus.OK : HttpStatus.NOT_FOUND)
                .body(authorDTO);
    }

    @PostMapping
    public AuthorDTO create(@RequestBody AuthorDTO authorDTO) {
        return authorService.save(authorDTO);
    }

    @PutMapping
    public AuthorDTO update(@RequestBody AuthorDTO authorDTO) {
        return authorService.update(authorDTO);
    }

    @DeleteMapping("/{id}")
    public AuthorDTO deleteById(@PathVariable("id") Long authorId) {
        return authorService.deleteById(authorId);
    }
}
