package com.jsp.Paymentwallet.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.Paymentwallet.dto.Login;
import com.jsp.Paymentwallet.dto.User;
import com.jsp.Paymentwallet.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService service;
	
	@PostMapping("/users")
	public User saveUser(@RequestBody User user) {
		return service.saveUser(user);
	}
	
	@GetMapping("/users/{id}")
	public User getUserById(@PathVariable int id) {
		return service.getUserById(id);
	}
	
	@DeleteMapping("/users/{id}")
	public User deleteUser(@PathVariable int id) {
		return service.deleteUser(id);
	}
	
	@PutMapping("/users")
	public User updateUser(@RequestBody User user) {
		return service.updateUser(user);
	}
	
	@GetMapping("/users/login")
	public User login(@RequestBody Login login) {
		return service.login(login);
	} 
}
