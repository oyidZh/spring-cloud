package com.oyid.cloud.config;

import org.springframework.stereotype.Component;

import com.oyid.cloud.entity.User;


@Component
public class HystrixUserFeignClientFallback implements UserFeignClient {

	@Override
	public User findById(Long id) {
		User user = new User();
		user.setId(0l);
		return user;
	}

}
