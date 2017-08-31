package com.andrew.controller;

import com.andrew.model.Book;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Author andre.
 */

@RestController
public class BookController {

    private List<Book> bookList;


    @RequestMapping(value = "/books", method = RequestMethod.GET)
    public List<Book> getBooks(){return init();}



    @RequestMapping(value = "/books/{id}", method = RequestMethod.GET)
    public Book getBookById(@PathVariable int id){
        return getBooks().get(id);
    }

    private List<Book> init(){
        bookList = new ArrayList<>();
        bookList.add(new Book(1,"Andrew"));
        bookList.add(new Book(2,"sdadsada"));
        bookList.add(new Book(3,"Andrdasdsadsadew"));
        bookList.add(new Book(4,"vnhgjgew"));
        return bookList;
    }

}
