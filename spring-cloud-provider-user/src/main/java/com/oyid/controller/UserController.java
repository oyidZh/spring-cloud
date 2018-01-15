package com.oyid.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.oyid.entity.User;
import com.oyid.repository.UserRepository;


@RestController
public class UserController {

	@RequestMapping("/hello")
	public String hello() {
		return "hello";
	}

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/simple/{id}")
	public User findById(@PathVariable Long id) {
		return this.userRepository.findOne(id);
	}
	
	@PostMapping("/postUser")
	public User postUser(@RequestBody User user) {
		return this.userRepository.findOne(user.getId());
	}
	// 该请求不会成功
	@GetMapping("/getUser")
	public User getUser(User user) {
		return this.userRepository.findOne(user.getId());
	}
	
	@GetMapping("/listAll")
	public List<User> getAll() {
		List<User> list = new ArrayList<User>();
		User user = new User();
		user.setId(1l);
		user.setName("zhangsna");
		list.add(user);
		user.setId(2l);
		list.add(user);
		user.setId(3l);
		list.add(user);
		return list;
	}
}
