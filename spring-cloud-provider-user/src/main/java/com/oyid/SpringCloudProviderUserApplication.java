package com.oyid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudProviderUserApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudProviderUserApplication.class, args);
	}
}
