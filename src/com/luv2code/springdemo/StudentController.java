package com.luv2code.springdemo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentController {

	@RequestMapping("/")
	public String showForm() {
		return "main-form";
	}
	
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		Student theStudent = new Student();
		
		theModel.addAttribute("student", theStudent);
		
		return "processd-form";
	}
	
	@RequestMapping("/processedForm")
	public String processForm(@ModelAttribute("student") Student theStuden) {
		
		String firstName = theStuden.getFirstName();
		String lastName = theStuden.getLastName();
		
		theStuden.setFirstName(firstName.toUpperCase());
		theStuden.setLastName(lastName.toUpperCase());
				
		return "confirm-student";
	}
}
