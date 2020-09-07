package com.zaini.company.repository;

import org.springframework.data.repository.CrudRepository;

import com.zaini.company.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {
} 
    
