package com.example.SampleProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SampleProjectApplication {
	
	@GetMapping
	public String getmessage() 
	{
		return "Hello , myself shrutii...";
	}
	
	public String getmessage1() 
	{
		return "Hello , myself shrutii...";
	}


	public static void main(String[] args) {
		SpringApplication.run(SampleProjectApplication.class, args);
	}

}
