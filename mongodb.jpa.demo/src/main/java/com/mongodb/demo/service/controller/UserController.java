package com.mongodb.demo.service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.demo.service.dao.UserRepository;
import com.mongodb.demo.service.entiry.UserInfo;

@RestController
@RequestMapping(value = "/user")
public class UserController {

	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public UserInfo findById(@PathVariable String id) {
		Optional<UserInfo> o = userRepository.findById(id);
		if(o.isPresent()) {
			UserInfo user = o.get();
			return user;
		}
		return null;
	}
}
