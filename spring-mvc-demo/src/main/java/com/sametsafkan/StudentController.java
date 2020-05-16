package com.sametsafkan;

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
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model theModel) {
		
		theModel.addAttribute("student", new Student());
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processFrom(@Valid @ModelAttribute("student") Student theStudent, BindingResult bindingResult) {
		System.out.println("theStudent : " + theStudent.toString());
		System.out.println("\n\n\n\n");
		System.out.println("Binding Result : " + bindingResult);
		System.out.println("\n\n\n\n");
		if(bindingResult.hasErrors()) {
			return "student-form";
		}else {
			return "student-confirmation";
		}
	}
	
	@InitBinder
	public void initBinder(WebDataBinder webDataBinder) {
		//Trim strings which came from form.
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
	
}
