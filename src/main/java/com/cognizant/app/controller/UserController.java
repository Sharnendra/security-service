package com.cognizant.app.controller;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.bind.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@SuppressWarnings("deprecation")
@RestController
//@RequestMapping("/secure")
public class UserController {

	/*@GetMapping(value="/hello")
	public String sayHello()
	{
		return "Hello Boot";
	}
	
	@GetMapping(value="/login")
	public ModelAndView userLogin()
	{
		return new ModelAndView("login");
	}
	
	@PostMapping(value="/loginUser")
	public String userLoggedin(@RequestParam Map<String, String> parameters) 
	{
		return "Hi "+parameters.get("emailAddress");
	}*/
	
	
	//-- New Functionality developed by Sharnendra on 22/2/2019 --//
	
	@GetMapping("/welcome")
	public ModelAndView firstPage(@AuthenticationPrincipal final UserDetails userDetails) {
		userDetails.getAuthorities().stream().forEach(x->System.err.println("value "+x));
		System.err.println("welcome "+userDetails.getUsername());
		return new ModelAndView("welcome","name", userDetails.getUsername());
	}

	@GetMapping(value = "/addNewEmployee")
	public ModelAndView show() {
		return new ModelAndView("addEmployee", "emp", null);
	}

	@PostMapping(value = "/addNewEmployee")
	public ModelAndView processRequest() {
		
		ModelAndView model = new ModelAndView("getEmployees");
		//model.addObject("employees", null);
		return model;
	}

	@GetMapping("/getEmployees")
	public ModelAndView getEmployees() {
		
		ModelAndView model = new ModelAndView("getEmployees");
		//model.addObject("employees", null);
		return model;
	}
	
	@GetMapping("/processor")
	public String processor() {
		return "processing..";
	}
	
	

}
