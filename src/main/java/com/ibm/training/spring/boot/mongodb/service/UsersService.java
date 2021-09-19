package com.ibm.training.spring.boot.mongodb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.training.spring.boot.mongodb.repository.UsersRepository;
import com.ibm.training.spring.boot.mongodb.domain.Users;

@Service
public class UsersService {

	@Autowired
	private UsersRepository repo;
	public List<Users> fetchAllUsers()
	{
		return repo.findAll();
	}
	
	
}
