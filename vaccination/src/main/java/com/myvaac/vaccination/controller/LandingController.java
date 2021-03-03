package com.myvaac.vaccination.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;

@Controller
public class LandingController {

	@GetMapping("/index")
	public String addViewControllers(ViewControllerRegistry registry) { 
        return "index";
    }
	
}
