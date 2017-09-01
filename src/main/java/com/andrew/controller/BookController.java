package com.andrew.controller;

import com.andrew.model.Author;
import com.andrew.model.Book;
import com.andrew.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * AuthorController andre.
 */

@RestController
public class BookController {

    private final BookServiceImpl bookService;
    private List<Book> bookList;

    @Autowired
    public BookController(BookServiceImpl bookService) {
        this.bookService = bookService;
    }


    @GetMapping(value = "/books")
    public List<Book> getBooks(){
        return bookService.getAll();
    }



    @GetMapping(value = "/books/{id}")
    public Book getBookById(@PathVariable int id) throws IndexOutOfBoundsException{
        bookList = getBooks();
        if(id< bookList.size())
            return bookList.get(id);
        return null;
    }

    @PostMapping(value = "/books")
        public ResponseEntity createBook(@RequestBody Book book) {
        bookService.add(book);
        return new ResponseEntity(book, HttpStatus.OK);
    }

}
