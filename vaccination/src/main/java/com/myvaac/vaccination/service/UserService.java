package com.myvaac.vaccination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.myvaac.vaccination.dto.User;
import com.myvaac.vaccination.repository.UserRepository;
import com.myvaac.vaccination.request.LoginRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String registerUser(User request) {
		User existingUser = userRepository.findByUserId(request.getUserId());
		if (existingUser == null) {
			userRepository.save(request);
			return "User Register Successfully. your User Id is " + request.getUserId();
		} else {
			return "UserId " + request.getUserId() + " already exist";
		}
	}

	public ResponseEntity<String> login(LoginRequest request) {
		User user = userRepository.findByUserIdAndPassword(request.getUserId(), request.getPassword());
		if (user != null) {
			return new ResponseEntity<String>(" User Logged In Successfully", HttpStatus.OK);
		} else {
			return new ResponseEntity<String>("Wrong credentials", HttpStatus.UNAUTHORIZED);
		}
	}

}
