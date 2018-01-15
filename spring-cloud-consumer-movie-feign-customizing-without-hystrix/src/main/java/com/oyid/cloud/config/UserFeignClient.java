package com.oyid.cloud.config;

import org.springframework.cloud.netflix.feign.FeignClient;

import com.oyid.cloud.entity.User;
import com.oyid.config.FeignConfiguration;

import feign.Param;
import feign.RequestLine;

@FeignClient(name = "spring-cloud-provider-user", configuration = FeignConfiguration.class, fallback = HystrixUserFeignClientFallback.class)
public interface UserFeignClient {

	@RequestLine("GET /simple/{id}") // feign 默认的注解
	User findById(@Param("id") Long id); // feign 默认的注解
}