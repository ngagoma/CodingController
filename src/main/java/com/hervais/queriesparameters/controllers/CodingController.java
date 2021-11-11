package com.hervais.queriesparameters.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CodingController {
	@RequestMapping("/coding")
	public String hello() {
		String name = "Hello Coding Dojo";
		return name;
	}
	
	@RequestMapping("/coding/python")
	public String python() {
		String name = "Python/Django was awesome!";
		return name;
	}
	
	@RequestMapping("/coding/java")
	public String java() {
		String name = "Java/Spring is better!";
		return name;
	}
	

}
