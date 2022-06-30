package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.registration.entity.User;
import com.example.registration.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService service;
	
	@PostMapping("/submit")
	public User submitUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	@PostMapping("/addUsers")
	public List<User> listUser(@RequestBody List<User> users) {
		return service.saveUsers(users);
	}
	@GetMapping("/users")
	public List<User> findAllUser(){
		return service.getUser();
	}
	@GetMapping("/user/{id}")
	public User findUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	@GetMapping("/user/{name}")
	public User findUserByName(@PathVariable String name) {
		return service.getUserByName(name);
	}
	@PutMapping("/update")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	@DeleteMapping("/delete/{name}")
	public String deleteUser(String name) {
		return service.deleteUser(name);
	}
}
