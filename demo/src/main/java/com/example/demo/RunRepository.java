package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.run.Run;

import jakarta.annotation.PostConstruct;

public class RunRepository {
    private List<Run> runs = new ArrayList<>();
    
    public List<Run> findAll(){
        return runs;
    }

    @PostConstruct
    private void init(){
        runs.add(new Run(1, "First Run", null, null, 5, null));
        runs.add(new Run(2, "Second Run", null, null, 10, null));
        runs.add(new Run(3, "Third Run", null, null, 15, null));
        runs.add(new Run(4, "Fourth Run", null, null, 20, null));
        runs.add(new Run(5, "Fifth Run", null, null, 25, null));
    }

    


}
