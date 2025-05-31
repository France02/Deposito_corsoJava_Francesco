package com.example.demo.run;

import java.lang.reflect.AccessFlag.Location;
import java.time.LocalDateTime;

public record Run(
    Integer id,
    String title,
    LocalDateTime startedOn,
    LocalDateTime completedOn,
    Integer miles,
    Location location
) {

    public Run{
        if(miles <0){
            throw new IllegalArgumentException("Miles cannot be negative");
        }
    }

}