package com.project.Shop.entity.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.Shop.repository.UserRepository;

@RestController
@RequestMapping(value = "/shop")
public class UserResources {

	@Autowired
	UserRepository repository;
	
}
