package com.example.demo.service;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.user;
import com.example.demo.repository.UserRepository;
@Service
public class userService {
	@Autowired
	private UserRepository userRepository;
	public List<user> getAllUsers(){
		return userRepository.findAll();
	}
	public user saveUser(user user) {
		return userRepository.save(user);
	}

}
