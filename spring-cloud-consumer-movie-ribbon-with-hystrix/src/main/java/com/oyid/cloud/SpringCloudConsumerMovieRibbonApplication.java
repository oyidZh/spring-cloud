package com.oyid.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import com.oyid.config.TestConfiguration;

@SpringBootApplication
@EnableEurekaClient
// @RibbonClient 表示负载到spring-cloud-provider-user服务时，执行自定义的配置
@RibbonClient(name = "spring-cloud-provider-user", configuration = TestConfiguration.class) 
@EnableCircuitBreaker
public class SpringCloudConsumerMovieRibbonApplication {

	@Bean
	@LoadBalanced
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(SpringCloudConsumerMovieRibbonApplication.class, args);
	}
	
	
}