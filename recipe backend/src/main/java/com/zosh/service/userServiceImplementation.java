package com.zosh.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zosh.config.JwtProvider;
import com.zosh.model.User;
import com.zosh.repository.UserRepository;

@Service
public class userServiceImplementation implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private JwtProvider jwtProvider;
	
	public User findUserById(Long userId) throws Exception {
		Optional<User> opt = userRepository.findById(userId);
		if(opt.isPresent()) {
			return opt.get();
		}
		throw new Exception("user not found with id "+userId);
		
	}

	@Override
	public User findUserByJwt(String jwt) throws Exception {
		
		String email = jwtProvider.getEmailFromJwtToken(jwt);
		
		if(email==null) {
			throw new Exception("provide valid jwt token....");
		}
		User user = userRepository.findByEmail(email);
		
		if(user==null) {
			throw new Exception("User not found with email "+email);
		}
		return user;
	}

	
	

}
