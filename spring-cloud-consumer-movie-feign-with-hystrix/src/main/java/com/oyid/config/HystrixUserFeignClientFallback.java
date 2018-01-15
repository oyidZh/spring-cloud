package com.oyid.config;

import org.springframework.stereotype.Component;

import com.oyid.entity.User;

@Component
public class HystrixUserFeignClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(0l);
		return user;
	}

	@Override
	public User findUserPost(User user) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findUserGet(User user) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
