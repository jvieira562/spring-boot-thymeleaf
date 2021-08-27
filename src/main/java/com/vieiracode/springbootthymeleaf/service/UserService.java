package com.vieiracode.springbootthymeleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vieiracode.springbootthymeleaf.models.User;
import com.vieiracode.springbootthymeleaf.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository repository;

	public void save(User user) {
		repository.save(user);
	}

}
