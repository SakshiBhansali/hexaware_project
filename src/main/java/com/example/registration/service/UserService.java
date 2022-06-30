package com.example.registration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.registration.entity.User;
import com.example.registration.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	public List<User> saveUsers(List<User> users){
		return repository.saveAll(users);
}
	public List<User> getUser(){
		return repository.findAll();
	
}
	public User getUserById(int id){
		return repository.findById(id).orElse(null);
}	
	public User getUserByName(String name){
		return repository.findByName(name);
}	
	public String deleteUser(String name) {
		repository.deleteByName(name);
		return "User Removed: "+name;
}
	
	public User updateUser(User user) {
		User exsistingUser=repository.findByName(user.getName()).orElse(null);
		exsistingUser.setFirstname(user.getFirstname());
		exsistingUser.setLastname(user.getLastname());
		exsistingUser.setEmailid(user.getEmailid());
		return repository.save(exsistingUser);
	
	
}
}

