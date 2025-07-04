package com.example.libreria.entity;

import jakarta.persistence.*;

@Entity
public class Autore {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String cognome;

    public Autore(){
        
    }

    public Autore(Long id, String nome, String cognome){
        this.id = id;
        this.nome = nome;
        this.cognome = cognome;

    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCognome(){
        return cognome;
    }

    public void setCognome(String cognome){
        this.cognome = cognome;
    }


}
