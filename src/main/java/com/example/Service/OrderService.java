package com.example.Service;

import java.util.List;

import com.example.Domain.OrderDto;
import com.example.Domain.OrderZomato;

public interface OrderService {

	
	public OrderZomato createOrder(OrderDto dto);
	
	
	public List<OrderZomato> getAllOrderZomaato();
}
