package com.example.libreria.controller;


import java.util.List;

import org.springframework.web.bind.annotation.*;
import com.example.libreria.entity.Autore;
import com.example.libreria.repository.AutoreRepository;


@RestController
public class AutoreController {
    private final AutoreRepository autoreRepository;
    public AutoreController(AutoreRepository autoreRepository){
        this.autoreRepository = autoreRepository;
    }

    @PostMapping("api/autore")
    public Autore createAutore(@RequestBody Autore nuovoAutore){
            return autoreRepository.save(nuovoAutore);
    }
    

    @GetMapping("/api/autore")
    List<Autore> findAll(){
        return autoreRepository.findAll();
    }

    @PutMapping("/api/autore/{id}")
    public Autore updateAutore(@PathVariable long id, @RequestBody Autore autoreAggioranto){
        return autoreRepository.findById(id)
            .map(autore -> {
                autore.setNome(autoreAggioranto.getNome());
                autore.setCognome(autoreAggioranto.getCognome());
                // aggiungi qui altri campi da aggiornare se necessario
                return autoreRepository.save(autore);
            })
            .orElseThrow(() -> new RuntimeException("Autore non trovato con id: " + id));
    }

    @DeleteMapping("/api/autore/{id}")
    public void deleteAutore(@PathVariable long id){
        if(!autoreRepository.existsById(id)){
            throw new RuntimeException("Autore non trovato con id: " + id);
        }

        autoreRepository.deleteById(id);
    }


}
