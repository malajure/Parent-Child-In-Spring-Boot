package com.masm;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/icog/services2")
public class WebController {
	
	
	@GetMapping("/")
	public String getHomePage() {
		return "childhomepage";
	}

}
