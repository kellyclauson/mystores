package com.islandsoftware.storefronthq;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@SpringBootApplication
public class StoreFrontHQApplication {

	public static void main(String[] args) {
		SpringApplication.run(StoreFrontHQApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(ApplicationContext ctx) {
		return args -> {
			System.out.println("StoreFrontHQ Is Up");
		};
	}
	@Bean
	public RestTemplate getRestTemplate() {
		return new RestTemplate();
	}

}
