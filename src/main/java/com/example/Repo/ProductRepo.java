package com.example.Repo;

import com.example.Domain.Product;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Product,Integer> {
	public List<Product> findByName(String name);
}
