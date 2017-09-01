package com.andrew.model;

import javax.persistence.*;

/**
 * Author andre.
 */
@Entity
@Table(name = "Author")
public class Author {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column
    private String name;

    @Column
    private String surname;

    public Author(Integer id,String name,String surname){
        this.id = id;
        this.name = name;
        this.surname = surname;
    }
    public Author(){}
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }
}
