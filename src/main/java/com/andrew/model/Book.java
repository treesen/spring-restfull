package com.andrew.model;


import javax.persistence.*;

/**
 * AuthorController andre.
 */

@Entity
@Table(name = "Books")
public class Book {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;
    @Column
    private String title;

    public Book(){}
    public Book( String title) {
        this.title = title;
    }
    public Book(Integer id, String title) {
        this.id = id;
        this.title = title;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
