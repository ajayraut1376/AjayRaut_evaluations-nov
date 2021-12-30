package com.example.carmanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.carmanagementservice")
public class CarmanagementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarmanagementserviceApplication.class, args);
	}

}
