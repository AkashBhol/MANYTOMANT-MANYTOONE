package com.example.Repo;

import com.example.Domain.OrderZomato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepo extends JpaRepository<OrderZomato,Integer> {
}
