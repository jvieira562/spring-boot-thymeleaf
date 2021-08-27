package com.vieiracode.springbootthymeleaf.repository;

import org.springframework.data.repository.CrudRepository;

import com.vieiracode.springbootthymeleaf.models.User;

public interface UserRepository extends CrudRepository<User, Long> {

}
