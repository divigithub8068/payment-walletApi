package com.jsp.Paymentwallet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsp.Paymentwallet.dao.UserDao;
import com.jsp.Paymentwallet.dto.Login;
import com.jsp.Paymentwallet.dto.User;

@Service
public class UserService {
	@Autowired
	UserDao dao;
	
	public User saveUser(User user) {
		return dao.saveUser(user);
	}
	
	public User getUserById(int id) {
		return dao.getUserById(id);
	}
	
	public List<User> getAllUser(){
		return dao.getAllUser();
	}
	
	public User updateUser(User user) {
		return dao.updateUser(user); 
	}
	
	public User deleteUser(int id) {
		return dao.deleteUser(id);
	}
	
	public User login(Login login) {
		return dao.login(login);
	}
}
