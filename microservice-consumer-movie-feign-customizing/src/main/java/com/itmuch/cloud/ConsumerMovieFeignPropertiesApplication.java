package com.itmuch.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableEurekaClient
public class ConsumerMovieFeignPropertiesApplication {

	public static void main(String[] args) {
		SpringApplication.run(ConsumerMovieFeignPropertiesApplication.class, args);
	}
}
