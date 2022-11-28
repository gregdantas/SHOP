package com.project.Shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Shop.entity.Category;
import com.project.Shop.repository.CategoriesRepo;

@Service
public class ServiceCategories {
	@Autowired
	CategoriesRepo repository ; 
	
	public  List<Category> findALL(){
		return repository.findAll();
		
	}
	
	public Category findByid(Long id) {
		Optional<Category>cat = repository.findById(id) ;
		return cat.get() ; 
	}
	

}
