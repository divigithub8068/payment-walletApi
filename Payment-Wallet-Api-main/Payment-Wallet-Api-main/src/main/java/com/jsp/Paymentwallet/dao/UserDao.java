package com.jsp.Paymentwallet.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.Paymentwallet.dto.Login;
import com.jsp.Paymentwallet.dto.User;
import com.jsp.Paymentwallet.repository.UserRepository;
@Repository
public class UserDao {
	@Autowired
	UserRepository repository;
	
	public User saveUser(User user) {
		return repository.save(user);
	}
	
	public User getUserById(int id) {
		Optional<User> optional = repository.findById(id);
		if(optional.isPresent()) {
			return optional.get();
		}
		return null;
	}
	
	public List<User> getAllUser(){
		return repository.findAll();
	}
	
	public User updateUser(User user) {
		Optional<User> optional = repository.findById(user.getId());
		if(optional.isPresent()) {
			return repository.save(user);
		}
		return null; 
	}
	
	public User deleteUser(int id) {
		Optional<User> optional = repository.findById(id);
		if(optional.isPresent()) {
			repository.delete(optional.get());
			return optional.get();
		}
		return null;
	}
	
	public User login(Login login) {
		return repository.login(login.getEmail(), login.getPassword());
	}
}
