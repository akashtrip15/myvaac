package com.myvaac.vaccination.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.myvaac.vaccination.dto.User;
import com.myvaac.vaccination.repository.UserRepository;
import com.myvaac.vaccination.request.LoginRequest;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	public String registerUser(User request) {
		userRepository.save(request);
		return "User Register Successfully. your User Id is " + request.getUserId();
	}

	public String login(LoginRequest request) {
		User user = userRepository.findByUserIdAndPassword(request.getUserId(), request.getPassword());
		if(user!=null) {
			return " User Logged In Successfully";
		}
		return null;
	}

}
