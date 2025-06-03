package com.example.libreria.entity;

import jakarta.persistence.*;

@Entity
public class Libro{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String author;
    private String anno;

    public Libro() {
    }   

    public Long getId(){
        return id;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAnno(){
        return anno;
    }

    public void setAnno(String anno){
        this.anno = anno;
    }

}