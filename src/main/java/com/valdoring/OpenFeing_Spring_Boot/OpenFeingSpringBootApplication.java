package com.valdoring.OpenFeing_Spring_Boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class OpenFeingSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenFeingSpringBootApplication.class, args);
	}

}
