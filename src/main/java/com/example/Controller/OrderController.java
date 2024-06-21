package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Domain.OrderDto;
import com.example.Domain.OrderZomato;
import com.example.Service.OrderService;

@RequestMapping("/api")
@RestController
public class OrderController {

	@Autowired
	private OrderService orderService;
	
	
	@PostMapping("/create/Order")
	public OrderZomato createOrder(@RequestBody OrderDto dto) {
		OrderZomato createOrder = orderService.createOrder(dto);
		return createOrder;
	}
}
