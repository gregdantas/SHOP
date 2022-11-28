package com.project.Shop.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.Shop.entity.Category;

public interface CategoriesRepo extends JpaRepository<Category, Long> {

}
