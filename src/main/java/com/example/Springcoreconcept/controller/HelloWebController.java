package com.example.Springcoreconcept.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloWebController {


	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}
	@GetMapping("/webmessage")
	public String message(Model model) {
		model.addAttribute("message","this is custom page");
		return"Message";
	}

}
