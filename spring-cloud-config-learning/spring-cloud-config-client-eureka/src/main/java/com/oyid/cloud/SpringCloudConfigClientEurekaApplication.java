package com.oyid.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudConfigClientEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigClientEurekaApplication.class, args);
	}
}
