package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ProviderUserRibbonApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProviderUserRibbonApplication.class, args);
	}
}
