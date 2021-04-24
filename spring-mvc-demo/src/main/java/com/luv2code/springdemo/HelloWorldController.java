package com.luv2code.springdemo;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/hello")
public class HelloWorldController {
	
	// Controller method to display the input HTML form to user
	@RequestMapping("/showForm")
	public String showForm() {
		return "helloWorld-form";
	}
	
	//Controller method to process the HTML form	
	@RequestMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	//Controller to process data from HTML form and add the data back to model
	
	@RequestMapping("processFormVersionTwo")
	public String letsShoutDude(HttpServletRequest request, Model model) {
		
		//Get the data from the request
		String userName = request.getParameter("name");
		
		//convert the data to all upper case
		userName = userName.toUpperCase();
		
		//Create the message to be added to model
		String result = "Yo! " + userName;
		
		//add the data to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
	
	//Controller to demonstrate the working of @RequestParam
	@RequestMapping("processFormVersionThree")
	public String processFormVersionThree(
			@RequestParam("name") String userName,
			Model model) {
		
		//convert the data to all upper case
		userName = userName.toUpperCase();
		
		//Create the message to be added to model
		String result = "Hello my friend from v3! " + userName;
		
		//add the data to model
		model.addAttribute("message", result);
		
		return "helloworld";
	}
	
}
