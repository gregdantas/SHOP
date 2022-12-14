package com.project.Shop.entity.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Shop.entity.Category;
import com.project.Shop.repository.CategoriesRepo;
import com.project.Shop.service.ServiceCategories;

@RestController

@RequestMapping(value = "/categories")
public class CategoryResources {
	
	
	@Autowired
	CategoriesRepo repository ; 
	
	@Autowired
	ServiceCategories service ; 
	
	@GetMapping
	public ResponseEntity<List<Category>> list(){
		return ResponseEntity.status(HttpStatus.OK).body(service.findALL()) ; 
	
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<Category> findYd(@PathVariable Long id){
		Category catorgoryId = service.findByid(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(catorgoryId); 
	}
}
