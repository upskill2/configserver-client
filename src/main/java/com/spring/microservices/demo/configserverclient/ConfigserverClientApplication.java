package com.spring.microservices.demo.configserverclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ConfigserverClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConfigserverClientApplication.class, args);
	}

}
