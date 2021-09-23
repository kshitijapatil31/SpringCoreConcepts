package com.example.Springcoreconcept.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloRestController {

	@RequestMapping(value= {"","/","/home"})
	public String SayHello(){
		return "Hello From kshitija";
		
	}
}
