package com.andrew.controller;

import com.andrew.model.Author;
import com.andrew.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.List;

/**
 * AuthorController andre.
 */


@RestController
public class AuthorController {


    private final AuthorServiceImpl authorService;
    private List<Author> authorList;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {
        this.authorService = authorService;
    }


    @GetMapping(value = "/authors")
    public List<Author> getAuthors(){
        return authorService.getAll();
    }



    @GetMapping(value = "/authors/{id}")
    public Author getAutorsById(@PathVariable int id){
        authorList = getAuthors();
        if(id< authorList.size())
            return authorList.get(id);
        return null;
    }

    @PostMapping(value = "/authors")
    public ResponseEntity createAuthor(@RequestBody Author author) {
        authorService.add(author);
        return new ResponseEntity(author, HttpStatus.OK);
    }


}
