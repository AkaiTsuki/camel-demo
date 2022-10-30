package com.example.cameldemo;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.impl.DefaultCamelContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamelDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CamelDemoApplication.class, args);
	}

}
