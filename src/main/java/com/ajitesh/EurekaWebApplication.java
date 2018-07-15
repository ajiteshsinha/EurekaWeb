package com.ajitesh;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class EurekaWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaWebApplication.class, args);
	}
}
