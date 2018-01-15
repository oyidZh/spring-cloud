package com.oyid.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.oyid.entity.User;

import feign.hystrix.FallbackFactory;

@Component
public class HystrixClientFallbackFactory implements FallbackFactory<UserFeignClient>{
	  private static final Logger LOGGER = LoggerFactory.getLogger(HystrixClientFallbackFactory.class);
	@Override
	public UserFeignClient create(Throwable cause) {
		LOGGER.info("fallback; reason was: {}", cause.getMessage());
		return new UserFeignClientWithFactory() {
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
			
			@Override
			public User findById(Long id) {
				User user = new User();
				user.setId(-1l);
				return user;
			}
		};
	}

}
