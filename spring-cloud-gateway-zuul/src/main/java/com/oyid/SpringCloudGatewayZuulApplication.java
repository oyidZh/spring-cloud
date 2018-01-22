package com.oyid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class SpringCloudGatewayZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudGatewayZuulApplication.class, args);
	}
}
