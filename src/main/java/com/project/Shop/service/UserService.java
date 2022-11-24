package com.project.Shop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.Shop.entity.User;
import com.project.Shop.repository.UserRepository;


@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public List<User> findALL(){
		return repository.findAll();
		
	}
	
	public User findByid(Long id) {
		Optional<User>user = repository.findById(id) ;
		return user.get() ; 
	}
}
