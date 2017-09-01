package com.andrew.controller;

import com.andrew.model.Author;

import com.andrew.service.impl.AuthorServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * AuthorController andre.
 */


@RestController
public class AuthorController {

    private List<Author> authorList;
    private final AuthorServiceImpl authorService;

    @Autowired
    public AuthorController(AuthorServiceImpl authorService) {

        this.authorService = authorService;

    }


    @RequestMapping(value = "/authors", method = RequestMethod.GET)
    public List<Author> getAuthors(){
        return authorService.getAll();
    }



    @RequestMapping(value = "/authors/{id}", method = RequestMethod.GET)
    public Author getAutorsById(@PathVariable int id){
        return getAuthors().get(id);
    }

    private List<Author> init(){
        authorList = new ArrayList<>();
        authorService.add(new Author(1,"Andrew" ,"Maslov"));
        authorService.add(new Author(2,"SEREP","ASDS"));
        return authorList;
    }

}
