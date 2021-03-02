package com.myvaac.vaccination.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.myvaac.vaccination.dto.User;
import com.myvaac.vaccination.request.LoginRequest;
import com.myvaac.vaccination.service.UserService;

@RestController
public class UserController {

	@Autowired
	private UserService userService;
	
	@PostMapping("/register")
	public ResponseEntity<String> registerUser(@RequestBody User request){
		String response = userService.registerUser(request);
		return new ResponseEntity<String>(response, HttpStatus.OK);
		
	}
	
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest request){
		return userService.login(request);
		
		
	}
}
