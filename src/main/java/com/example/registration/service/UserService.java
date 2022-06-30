package com.example.registration.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.User;
import com.example.registration.repository.UserRepository;
import java.util.List;
@Service
public class UserService {
	@Autowired private UserRepository repo;
	public List<User> listAll() {
		return (List<User>) repo.findAll();
		
		
	}
	
	
	
}