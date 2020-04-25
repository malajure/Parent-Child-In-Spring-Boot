package com.masm.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/my/services")
public class HomeController {
	
	@GetMapping("/home")
	public String getHome() {
		return "home";
	}

}
