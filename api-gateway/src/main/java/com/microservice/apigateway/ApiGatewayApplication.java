package com.microservice.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiGatewayApplication.class, args);
	}

}
//<dependency>
//<groupId>org.springframework.cloud</groupId>
//<artifactId>spring-cloud-starter-gateway-mvc</artifactId>
//</dependency>