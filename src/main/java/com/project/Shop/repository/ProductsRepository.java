package com.project.Shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Shop.entity.Product;

public interface ProductsRepository extends JpaRepository<Product, Long> {

}
