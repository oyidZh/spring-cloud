package com.oyid.cloud.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.oyid.config.FeignClient2Configuration;


@FeignClient(name = "xxxx", url = "http://localhost:8761/", configuration = FeignClient2Configuration.class, fallback = HystrixFeignClient2Fallback.class)
public interface FeignClient2 {

	@RequestMapping("eureka/apps/{serviceName}")
	public String findServiceInfoFromEurekaByServiceName(@PathVariable("serviceName") String serviceName);

}