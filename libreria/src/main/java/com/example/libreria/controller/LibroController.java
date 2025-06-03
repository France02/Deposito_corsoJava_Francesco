package com.example.libreria.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.libreria.entity.Libro;
import com.example.libreria.repository.LibroRepository;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;





@RestController
public class LibroController {

    private final LibroRepository libroRepository;
    public LibroController(LibroRepository libroRepository){
        this.libroRepository = libroRepository;
    }

    @PostMapping("api/libro")
    public Libro createLibro(@RequestBody Libro nuovoLibro) {
        
        return libroRepository.save(nuovoLibro);
    }
    
    @GetMapping("/api/libro")
    List<Libro> findAll(){
        return libroRepository.findAll();
    }

    @PutMapping("api/libro/{id}")
    public Libro updateLibro(@PathVariable Long id, @RequestBody Libro libroAggiornato) {
        return libroRepository.findById(id)
        .map(libro -> {
            libro.setTitle(libroAggiornato.getTitle());
            libro.setAuthor(libroAggiornato.getAuthor());
            libro.setAnno(libroAggiornato.getAnno());
            return libroRepository.save(libro);
        })
        .orElseThrow(() -> new RuntimeException("Libro non trovato con id: " + id));
    }
    
    @DeleteMapping("api/libro/{id}")
    public void deleteLibro(@PathVariable Long id){
        if(!libroRepository.existsById(id)){
            throw new RuntimeException("Libro non trovato con id: " + id);
        }
        libroRepository.deleteById(id);
    }
    
} 