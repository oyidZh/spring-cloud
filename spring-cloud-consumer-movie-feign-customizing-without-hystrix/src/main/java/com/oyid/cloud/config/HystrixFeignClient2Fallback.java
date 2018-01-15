package com.oyid.cloud.config;

import org.springframework.stereotype.Component;

@Component
public class HystrixFeignClient2Fallback implements FeignClient2{

	@Override
	public String findServiceInfoFromEurekaByServiceName(String serviceName) {
		return "hahaha";
	}
}
