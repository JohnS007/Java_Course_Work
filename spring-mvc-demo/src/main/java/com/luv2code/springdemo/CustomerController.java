package com.luv2code.springdemo;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//Adding @InitBinder to pre process the data being passed to controller
	//In this case, all the data will be trimmed off leaving no leading and trailing white spaces
	
	@InitBinder //using @InitBinder annotation to pre-process the data
				//using WebDataBinder to bind the incoming data to the custom trimming logic
	public void initBinder(WebDataBinder dataBinder) {
		
		//Defining a custom StringTrimmerEditor to trim leading & trailing white spaces
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		
		//register the custom StringTrimmerEditor to the WebDataBinder to make use
		// of the trimming logic to trim off the spaces
		dataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
		
	}
	
	
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		//Adding a new Customer to the model to be used by the model backed form
		theModel.addAttribute("customer", new Customer());
		
		//render the customer form
		return "customer-form";
	}
	
	
	@RequestMapping("/processForm")
	public String processForm(
			//Enforcing validations using @Valid annotation along with the ModelAttribute
			//Remember!! Use the BindingResult just after the @Valid, @ModelAttribute
			//If not used just after these two, no validations performed
			@Valid @ModelAttribute("customer") Customer theCustomer,
			BindingResult theBindingResult) {
		
		//Adding debugging output to test what is being passed in the controller
		System.out.println("Last Name: |" + theCustomer.getLastName() + "|");
		
		if(theBindingResult.hasErrors()) {
			return "customer-form";
		}
		else {
			return "customer-confirmation";
		}
		
	}
}
