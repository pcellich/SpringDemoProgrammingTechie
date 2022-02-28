package com.example.SpringbootDineshKrishnan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
public class SpringbootDineshKrishnanApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDineshKrishnanApplication.class, args);
	}

}
