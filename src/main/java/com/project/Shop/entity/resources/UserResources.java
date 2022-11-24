package com.project.Shop.entity.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Shop.entity.User;
import com.project.Shop.repository.UserRepository;

@RestController
@RequestMapping(value = "/shop")
public class UserResources {

	@Autowired
	UserRepository repository;
	
	@GetMapping(value = "/list")
	public ResponseEntity<List<User>> list(){
		return ResponseEntity.status(HttpStatus.OK).body(repository.findAll()) ; 
	}
	
	
}
