package com.example.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Domain.User;

public interface UserRepo extends JpaRepository<User, Integer> {

}
