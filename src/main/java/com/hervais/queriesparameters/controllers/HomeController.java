package com.hervais.queriesparameters.controllers;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
//	@RequestMapping("/") or
//	@RequestMapping(value="/", method=RequestMethod.GET)
	@RequestMapping(path="/", method=RequestMethod.GET)
	public String index(@RequestParam(value="q", required = false) String searchQuery, Model model) {
		System.out.println(model.addAttribute("Name Enter: ", searchQuery));
		return "My Page " + searchQuery;
	}
	
	@RequestMapping("/users/{name}")
	public String users(@PathVariable("name") String userName) {
		System.out.println(userName);
		return "Hello " + userName;
		
	}
}
