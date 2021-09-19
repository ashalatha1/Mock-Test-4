package com.ibm.training.spring.boot.mongodb.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.training.spring.boot.mongodb.domain.Users;
import com.ibm.training.spring.boot.mongodb.repository.UsersRepository;
import com.ibm.training.spring.boot.mongodb.service.UsersService;

@RestController
public class AppController {

	@Autowired
	private UsersService service;
	
	@Autowired
	private UsersRepository rep;
	
	@GetMapping(value="/users",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Users> getUsers(){
		
      return service.fetchAllUsers();
	}
	
	@PostMapping(value="/saveUser",produces=MediaType.APPLICATION_JSON_VALUE)
	public String saveUsers(@RequestBody Users users)
	{
		 Users iuser = rep.insert(users);
		return "Added user details" +iuser.getFirstname();
	}
}
