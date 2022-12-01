package com.project.Shop.entity.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Shop.entity.User;
import com.project.Shop.repository.UserRepository;
import com.project.Shop.service.UserService;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

	@Autowired
	UserRepository repository;
	@Autowired
	UserService service ; 
	
	@GetMapping
	public ResponseEntity<List<User>> list(){
		return ResponseEntity.status(HttpStatus.OK).body(service.findALL()) ; 
	}
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findByid(@PathVariable Long id){
		User userId = service.findByid(id);
		
		return ResponseEntity.status(HttpStatus.OK).body(userId); 
	}
}