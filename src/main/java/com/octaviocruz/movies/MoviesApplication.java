package com.octaviocruz.movies;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController //with this the framework knows this is a rest api controller class
public class MoviesApplication {

	public static void main(String[] args) {

		SpringApplication.run(MoviesApplication.class, args);
	}

	@GetMapping("/root") //works to let the framework know this is an api get route
	public String apiRoot(){
		return "Hello world";
	}

}
