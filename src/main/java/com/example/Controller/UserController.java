package com.example.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Domain.User;
import com.example.Service.UserService;

@RequestMapping("/api/n2")
@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	
	@PostMapping("/creteUser")
	public User createUser(@RequestBody User user) {
		User createUser = service.createUser(user);
		return createUser;
	}
	
	@GetMapping("/get/user")
	public List<User> getALlUuser(){
		List<User> allUser = service.getAllUser();
		return allUser;
	}
	
}
