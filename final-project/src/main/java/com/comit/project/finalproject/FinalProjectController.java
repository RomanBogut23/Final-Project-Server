package com.comit.project.finalproject;

import org.springframework.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FinalProjectController {

	
	@GetMapping("/sayHello")
	public String sayHelloWorld() {
		return "Hello World";
	}
}
