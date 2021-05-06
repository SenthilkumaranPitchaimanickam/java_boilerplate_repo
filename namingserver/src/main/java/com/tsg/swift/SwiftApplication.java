package com.tsg.swift;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SwiftApplication {

	public static void main(String[] args) {
		SpringApplication.run(SwiftApplication.class, args);
	}

}
