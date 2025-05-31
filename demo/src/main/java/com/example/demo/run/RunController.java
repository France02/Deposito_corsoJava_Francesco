package com.example.demo.run;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.RunRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class RunController {
    public final RunRepository runRepository;

    public RunController(RunRepository runRepository) {
        this.runRepository = runRepository;
    }

    @GetMapping("/api/runs")
   List<Run> findAll(){
    return runRepository.findAll();
    }
   
}
    

