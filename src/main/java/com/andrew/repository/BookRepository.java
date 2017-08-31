package com.andrew.repository;

import com.andrew.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author andre.
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
