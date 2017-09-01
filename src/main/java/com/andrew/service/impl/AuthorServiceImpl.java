package com.andrew.service.impl;

import com.andrew.model.Author;
import com.andrew.repository.AuthorRepository;
import com.andrew.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author andre.
 */
@Service
public class AuthorServiceImpl implements AuthorService {


    private final AuthorRepository authorRepository;

    @Autowired
    public AuthorServiceImpl(AuthorRepository authorRepository) {
        this.authorRepository = authorRepository;
    }


    @Override
    public void add(Author author) {
        authorRepository.saveAndFlush(author);
    }

    @Override
    public Author getById(Integer id) {
        return authorRepository.getOne(id);
    }

    @Override
    public List<Author> getAll() {
        return authorRepository.getAll();
    }
}
