package com.ibm.training.spring.boot.mongodb.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.ibm.training.spring.boot.mongodb.domain.Users;

public interface UsersRepository extends MongoRepository<Users,String> {

}
