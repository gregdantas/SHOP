package com.project.Shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Shop.entity.Order;
import com.project.Shop.repository.OrderRepository;


@Service
public class OrderService {

	@Autowired
	OrderRepository repository;

	public  List<Order> findALL(){
		return repository.findAll();
		
	}
	
	public Order findByid(Long id) {
		Optional<Order>order = repository.findById(id) ;
		return order.get() ; 
	}
}
