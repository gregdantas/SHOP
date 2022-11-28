package com.project.Shop.config;

import java.time.Instant;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.Shop.entity.Category;
import com.project.Shop.entity.Order;
import com.project.Shop.entity.User;
import com.project.Shop.repository.CategoriesRepo;
import com.project.Shop.repository.OrderRepository;
import com.project.Shop.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {


	@Autowired
	UserRepository repository;
	@Autowired
	CategoriesRepo categoryRepository;
    @Autowired
    OrderRepository orderRepository ; 
    
	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "FIRST USER", "USER@USER1", "13345697", "0000", null);
		User user2 = new User(null, "SECOND USER", "USER@USER2", "9999999", "1111", null);

		repository.saveAll(Arrays.asList(user1, user2));
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"),1, user1); 
		Order o2 = new Order(null, Instant.parse("2019-07-21T03:42:10Z"), 2, user2); 
		Order o3 = new Order(null, Instant.parse("2019-07-22T15:21:22Z"), 1, user1);
		orderRepository.saveAll(Arrays.asList(o1, o2, o3));
		
		Category cat1 = new Category(null, "Electronics"); 
		Category cat2 = new Category(null, "Books"); 
		Category cat3 = new Category(null, "Computers"); 
		categoryRepository.saveAll(Arrays.asList(cat1,cat2,cat3));
		
	}
}
