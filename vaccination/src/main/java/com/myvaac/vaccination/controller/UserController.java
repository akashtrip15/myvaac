package com.myvaac.vaccination.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.myvaac.vaccination.dto.User;
import com.myvaac.vaccination.request.LoginRequest;
import com.myvaac.vaccination.service.UserService;

@Controller
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping("/register")
	public String registerUser(@ModelAttribute User user,HttpServletRequest request){
		String response = userService.registerUser(user);
		request.setAttribute("status", response);
		//return new ResponseEntity<String>(response, HttpStatus.OK);
		return "success";
		
	}
	@PostMapping("/login")
	public ResponseEntity<String> login(@RequestBody LoginRequest request){
		return userService.login(request);
	}
}
