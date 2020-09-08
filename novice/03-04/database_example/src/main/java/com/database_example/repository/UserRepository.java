package com.database_example.repository;

import org.springframework.data.repository.CrudRepository;

import com.database_example.model.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface UserRepository extends CrudRepository<User, Long> {

}