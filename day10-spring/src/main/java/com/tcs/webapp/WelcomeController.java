package com.tcs.webapp;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/go")
public class WelcomeController {
	@RequestMapping(value="/m1",method=RequestMethod.GET)
	public String method() {
		System.out.println("from controller...");
		return "welcome";
	}
	@RequestMapping(value="/m2",method=RequestMethod.GET)
	public String method2(Model model) {
		model.addAttribute("course","JAVA FSD" );
		
		System.out.println("from controller...");
		return "register";
	}
	
	

	

}
