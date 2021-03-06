package com.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloSpringBootDockersApplication {

	@RequestMapping("/hello")
	public String sayHello() {
		return "Hello Docker World It Has worked with Git";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloSpringBootDockersApplication.class, args);
	}
}
