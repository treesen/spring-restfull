package com.andrew.service;

import com.andrew.model.Author;

import java.util.List;

/**
 * Author andre.
 */
public interface AuthorService {
    void add(Author author);
    Author getById(Integer id);
    List<Author> getAll();
}
