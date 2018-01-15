package com.oyid.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oyid.cloud.config.FeignClient2;
import com.oyid.cloud.config.UserFeignClient;
import com.oyid.cloud.entity.User;

@RestController
public class MovieController {


	@Value("${user.userServicePath}")
	private String userServicePath;
	
	@Autowired
	private UserFeignClient userFeignClient;
	
	@Autowired
	private FeignClient2 feignClient2;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		return userFeignClient.findById(id);
	}
	
	@GetMapping("/{serviceName}")
	public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName")String serviceName) {
		return feignClient2.findServiceInfoFromEurekaByServiceName(serviceName);
	}
}
