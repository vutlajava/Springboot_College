package com.psira;

import java.util.Collections;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication app = new SpringApplication(Application.class);
		//SpringApplication.run(Application.class, args);
		
		app.setDefaultProperties(Collections
		          .singletonMap("server.port", "8082"));
		        app.run(args);
	}

}
