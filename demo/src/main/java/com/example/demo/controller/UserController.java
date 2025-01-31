package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.user;
import com.example.demo.service.userService;

@RestController
@RequestMapping("/")
public class UserController {
	@Autowired
	private userService UserService;
	@GetMapping("users")
	public List<user> getAllUsers(){
		return UserService.getAllUsers();
	}
	@PostMapping("users")
	public user createUser(@RequestBody user user) {
		return UserService.saveUser(user);
	}

}
