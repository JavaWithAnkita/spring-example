package com.ankita.spring.example.springDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class SpringDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}
	
	@GetMapping("/")
	public String welcome(){
		return "Welcome to openshift";
	}

	@GetMapping("/{input}")
			public String congrats(@PathVariable String input){
				return "Congrats" + input + "U have successfully deployed application on Openshift";
			}

}

