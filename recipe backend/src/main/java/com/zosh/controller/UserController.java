package com.zosh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import com.zosh.model.User;
import com.zosh.service.UserService;

@RestController
public class UserController {
	
//	@Autowired
//	private UserRepository userRepository;
	
	@Autowired
	private UserService userService;
	
	
	@GetMapping("/api/users/profile")
	public User findUserByJwt(@RequestHeader("Authorization") String jwt) throws Exception {
		User user = userService.findUserByJwt(jwt);
		
		return user;
	}
	
	
//	@PostMapping("/users")
//	public User createUser(@RequestBody User user) throws Exception {
//		
//		User isExist=userRepository.findByEmail(user.getEmail());
//		if(isExist!=null) {
//			throw new Exception("user is exist with "+user.getEmail());
//		}
//		User savedUser = userRepository.save(user);
//		return savedUser;	
//	}
	
	
	
	
//	@DeleteMapping("/users/{userId}")
//	public String deleteUser(@PathVariable Long userId) throws Exception {
//		userRepository.deleteById(userId);
//		return "User deleted successfully";
//	}
	
	
	
//	@GetMapping("/users")
//	public List<User> getAllUser(){
//		List<User> users = userRepository.findAll();
//		return users;
//	}
	
//	public User findByEmail(String email) throws Exception {
//		User user = userRepository.findByEmail(email);
//		if(user==null) {
//			throw new Exception("User not found with email "+email);
//		}
//		return user;
//	}
	
	
	

}
