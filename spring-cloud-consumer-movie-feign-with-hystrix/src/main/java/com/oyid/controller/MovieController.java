package com.oyid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.oyid.config.UserFeignClient;
import com.oyid.entity.User;

@RestController
public class MovieController {


	@Value("${user.userServicePath}")
	private String userServicePath;
	
	@Autowired
	private UserFeignClient userFeignClient;

	@GetMapping("/movie/{id}")
	public User findById(@PathVariable Long id) {
		return userFeignClient.findById(id);
	}
	
	@GetMapping("/postUser")
	public User testPost(User user) {
		return userFeignClient.findUserPost(user);
	}
	// 该请求不会成功
	@GetMapping("/getUser")
	public User testGet(User user) {
		return userFeignClient.findUserGet(user);
	}
}
