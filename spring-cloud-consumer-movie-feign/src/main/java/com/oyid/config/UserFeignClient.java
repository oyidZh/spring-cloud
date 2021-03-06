package com.oyid.config;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.oyid.entity.User;

@FeignClient("spring-cloud-provider-user")
public interface UserFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/simple/{id}")  // 此处只能用RequestMapping
    User findById(@PathVariable("id") Long id); /// 此处含有参数必须@PathVariable设置value
    
    @RequestMapping(method = RequestMethod.POST, value = "/postUser")  // 此处只能用RequestMapping
    User findUserPost(@RequestBody User user); /// 此处含有参数必须@PathVariable设置value
 // 该请求不会成功
    @RequestMapping(method = RequestMethod.GET, value = "/getUser")  // 此处只能用RequestMapping
    User findUserGet(User user); /// 此处含有参数必须@PathVariable设置value
}