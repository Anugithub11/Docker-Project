package com.amdocs.Docker;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class BasicController1 { 
	@GetMapping("/message")
	public String print() {
		return "Welcome to amdocs";
	
	
	}
}

	


