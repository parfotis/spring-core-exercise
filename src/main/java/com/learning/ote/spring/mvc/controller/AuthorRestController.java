package com.learning.ote.spring.mvc.controller;

import com.learning.ote.spring.mvc.domain.dto.AuthorDTO;
import com.learning.ote.spring.mvc.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/authors")
public class AuthorRestController {

    @Autowired
    AuthorService authorService;

    @GetMapping("/")
    public List<AuthorDTO> findAll() {
        return authorService.findAll();
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<AuthorDTO> findById(@PathVariable("id") Long authorId) {
//        AuthorDTO authorDTO = authorService.findById(authorId);
//
//        return ResponseEntity
//                .status((authorDTO != null) ? HttpStatus.OK : HttpStatus.NOT_FOUND)
//                .body(authorDTO);
//    }
//
//    @GetMapping("")
//    public ResponseEntity<List<AuthorDTO>> findByTitle(@RequestParam("title") String authorTitle, @RequestParam(name = "category", required = false) String category) {
//        List<AuthorDTO> authorDTOList = authorService.findByTitle(authorTitle);
//
//        return ResponseEntity
//                .status(HttpStatus.OK)
//                .body(authorDTOList);
//    }
//
//    @PostMapping
//    public AuthorDTO create(@RequestBody AuthorDTO authorDTO) {
//        return authorService.save(authorDTO);
//    }

}
