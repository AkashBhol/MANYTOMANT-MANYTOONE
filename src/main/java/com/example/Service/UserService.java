package com.example.Service;

import java.util.List;

import com.example.Domain.User;

public interface UserService {

	
	public User createUser(User user);
	
	public List<User> getAllUser();
}
