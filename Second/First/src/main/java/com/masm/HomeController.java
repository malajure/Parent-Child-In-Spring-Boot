package com.masm;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/icog/services")
public class HomeController {

	@GetMapping("/")
	public String getHomePage() {
		return "icgohomepage";
	}

	@GetMapping("/second")
	public Map<String, Object> getSecondPage() {

		Map<String, Object> result = new HashMap<String, Object>();

		result.put("company", "Masm");
		result.put("userId", 30300);
		return result;
	}

}
