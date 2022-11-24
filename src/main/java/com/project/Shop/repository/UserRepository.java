package com.project.Shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Shop.entity.User;

public interface UserRepository extends JpaRepository <User , Long>{
	
}
