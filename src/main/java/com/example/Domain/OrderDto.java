package com.example.Domain;

import java.util.List;

import lombok.Data;

@Data
public class OrderDto {

	private User user;
	
	private List<Product> products;
	
	private String title;
}
