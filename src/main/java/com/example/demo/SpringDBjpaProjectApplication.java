package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDBjpaProjectApplication {
	@Autowired
	private static NameRepository repository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDBjpaProjectApplication.class, args);
		repository.getAllNames();
		System.out.println(repository.getAllNames());
	}
}
