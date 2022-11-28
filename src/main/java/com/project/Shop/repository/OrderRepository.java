package com.project.Shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Shop.entity.Order;

public interface OrderRepository extends JpaRepository <Order , Long>{
	
}
