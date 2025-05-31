package com.example.demo;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.example.demo.run.Run;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);

	}

	@Bean
	CommandLineRunner runner() {
		return (args) -> {
			Run run = new Run(1, "First Run", LocalDateTime.now(),
					LocalDateTime.now().plus(1, ChronoUnit.HOURS), 5,
					null);
			System.out.println("Run " + run);
		};
	}
}
