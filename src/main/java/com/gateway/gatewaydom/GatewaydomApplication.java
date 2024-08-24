package com.gateway.gatewaydom;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class GatewaydomApplication {

	public static void main(String[] args) {
		SpringApplication.run(GatewaydomApplication.class, args);
	}

}
