package com.andrew.service.impl;

import com.andrew.model.Book;
import com.andrew.repository.BookRepository;
import com.andrew.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author andre.
 */

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;


    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public void add(Book book) {
        bookRepository.saveAndFlush(book);
    }

    @Override
    public List<Book> getAll() {
        return null;
    }
}
