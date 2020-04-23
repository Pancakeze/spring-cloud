package com.zbz.clientgateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//@EnableDiscoveryClient
@EnableEurekaClient
public class ClientGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ClientGatewayApplication.class, args);
	}

}
