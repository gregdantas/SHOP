package com.project.Shop.entity.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Shop.entity.Order;
import com.project.Shop.repository.OrderRepository;
import com.project.Shop.service.OrderService;

@RestController
@RequestMapping(value = "/orders")
public class OrderResources {

	@Autowired
	OrderRepository repository;
	@Autowired
	OrderService service ; 
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<Order>> list(){
		return ResponseEntity.status(HttpStatus.OK).body(service.findALL()) ; 
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Order> findYd(@PathVariable Long id){
		Order orderId = service.findByid(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(orderId); 
	}
}
