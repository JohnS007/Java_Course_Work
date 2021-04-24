package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ConflictController {
	
	@RequestMapping("/showForm")
	public String displayInputForm() {
		return "conflict";
	}
	
}
