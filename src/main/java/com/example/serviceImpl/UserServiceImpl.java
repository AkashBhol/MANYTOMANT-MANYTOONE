package com.example.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Domain.User;
import com.example.Repo.UserRepo;
import com.example.Service.UserService;
import com.example.Util.BasicUtil;

@Service
public class UserServiceImpl extends BasicUtil implements UserService{

	@Autowired
	private UserRepo  repo;

	@Override
	public User createUser(User user) {
		User save = repo.save(user);
		return save;
	}

	@Override
	public List<User> getAllUser() {
		List<User> findAll = repo.findAll();
		return findAll;
	}
}
