package com.example.registration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.registration.entity.User;
import com.example.registration.service.UserService;

@Controller
public class UserController {
	@Autowired private UserService service;
	@GetMapping("/users")
	public String showUserList(Model model) {
		List<User>listUsers = service.listAll();
		return "users";
		
	}
}
