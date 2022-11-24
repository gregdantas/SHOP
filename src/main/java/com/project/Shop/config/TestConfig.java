package com.project.Shop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.project.Shop.entity.User;
import com.project.Shop.repository.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

	@Autowired
	UserRepository repository;

	@Override
	public void run(String... args) throws Exception {
		User user1 = new User(null, "FIRST USER", "USER@USER1", "13345697", "0000");
		User user2 = new User(null, "SECOND USER", "USER@USER2", "9999999", "1111");

		repository.saveAll(Arrays.asList(user1, user2));

	}
}
