package com.oyid.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.oyid.cloud.entity.User;

@RestController
public class MovieController {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private LoadBalancerClient loadBalancerClient;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		// http://localhost:8762/simple/
		// ribbon 负载均衡虚拟ip
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("spring-cloud-provider-user");
		System.out.println(serviceInstance.getServiceId() + " " + serviceInstance.getHost()+" "+serviceInstance.getPort());
		return this.restTemplate.getForObject("http://spring-cloud-provider-user/simple/"+id, User.class);
	}
	
	@GetMapping("/test")
	public String test() {
		ServiceInstance serviceInstance = loadBalancerClient.choose("spring-cloud-provider-user");
		System.out.println(serviceInstance.getServiceId() + " " + serviceInstance.getHost()+" "+serviceInstance.getPort());
		return "1";
	}
}
