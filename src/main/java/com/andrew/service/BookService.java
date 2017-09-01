package com.andrew.service;

import com.andrew.model.Book;

import java.util.List;

/**
 * AuthorController andre.
 */
public interface BookService {


    void add(Book book);
    List<Book> getAll();
}
