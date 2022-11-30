package com.project.Shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Shop.entity.Product;
import com.project.Shop.repository.ProductsRepository;


@Service
public class ProductService {

	@Autowired
	ProductsRepository repository;

	public  List<Product> findALL(){
		return repository.findAll(); 
		
	}
	
	public Product findByid(Long id) {
		Optional<Product>prod = repository.findById(id) ;
		return prod.get() ; 
	}
}
