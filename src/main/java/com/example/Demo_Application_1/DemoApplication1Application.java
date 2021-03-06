package com.example.Demo_Application_1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoApplication1Application {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication1Application.class, args);
	}
	
	@RestController
	public class HelloController {

		@GetMapping("/")
		public String index() {
			return "Demo Application 1 . Change: 1";
		}

	}

}
