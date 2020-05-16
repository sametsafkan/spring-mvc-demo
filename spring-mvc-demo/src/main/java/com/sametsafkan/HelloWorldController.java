package com.sametsafkan;


import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {

	@GetMapping("/showForm")
	public String showForm() {
		return "helloworld-form";
	}
	
	@GetMapping("/processForm")
	public String processForm() {
		return "helloworld";
	}
	
	@GetMapping("/processFormV2")
	public String processFormV2(HttpServletRequest request, Model model) {
		String studentName = request.getParameter("studentName");
		model.addAttribute("studentName", studentName.toUpperCase());
		return "helloworldV2";
	}
	
	@GetMapping("/processFormV3")
	public String processFormV3(@RequestParam("studentName") String theName, Model model) {
		model.addAttribute("studentName", theName.toUpperCase());
		return "helloworldV2";
	}
}
