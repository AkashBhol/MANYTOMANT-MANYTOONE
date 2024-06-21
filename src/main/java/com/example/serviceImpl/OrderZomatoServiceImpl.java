package com.example.serviceImpl;

import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Domain.OrderDto;
import com.example.Domain.OrderZomato;
import com.example.Repo.OrderRepo;
import com.example.Repo.ProductRepo;
import com.example.Service.OrderService;
import com.example.Util.BasicUtil;

@Service
public class OrderZomatoServiceImpl extends BasicUtil implements OrderService{
	
	@Autowired
	private OrderRepo orderRepo;
	
	
	@Autowired
	private ProductRepo productRepo;


	@Override
	public OrderZomato createOrder(OrderDto dto) {
		OrderZomato orderZomato=new OrderZomato();
		orderZomato.setUser(dto.getUser());
		orderZomato.setProducts(dto.getProducts());
		orderZomato.setTitle(dto.getTitle());
		OrderZomato save = orderRepo.save(orderZomato);
		return save;
	}


	@Override
	public List<OrderZomato> getAllOrderZomaato() {
		// TODO Auto-generated method stub
		return null;
	}
	


	
}
