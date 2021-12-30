package com.example.customermanagementservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="com.example.customermanagementservice")
public class CustomermanagementserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomermanagementserviceApplication.class, args);
	}

}
