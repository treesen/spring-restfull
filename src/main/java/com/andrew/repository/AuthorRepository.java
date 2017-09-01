package com.andrew.repository;

import com.andrew.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Author andre.
 */
@Repository
public interface AuthorRepository extends JpaRepository<Author,Integer>{

    @Query("SELECT a FROM Author a")
    List<Author> getAll();
}
