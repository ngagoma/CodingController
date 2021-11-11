package com.hervais.queriesparameters.controllers;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {
	
	String dojo;
	@RequestMapping(value ="/{name}")
	public String getText(@PathVariable("name") String userName) {
		dojo = userName;
		return "The " + dojo + " is awesome";
	}
	
	
	@RequestMapping(path = "/dojo/{val2}")
	public String burbank(@PathVariable("val2") String bank) {
		return bank + " " + dojo + " is located in Southern California";
	}
	
	@RequestMapping(path = "/{variable1}/{variable2}")
	public String SJ(@PathVariable("variable1") String dojo, @PathVariable("variable2") String cityName) {
		String str1 = Character.toString(cityName.charAt(0));
		String str2 = Character.toString(cityName.substring(cityName.indexOf('-') + 1).charAt(0));
		String str = str1.toUpperCase() +""+ str2.toUpperCase();
		return str + " " + dojo + " is the headquarters";
	}
}

