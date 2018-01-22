package com.oyid.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringCloudConfigServerAuthcApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConfigServerAuthcApplication.class, args);
	}
}
