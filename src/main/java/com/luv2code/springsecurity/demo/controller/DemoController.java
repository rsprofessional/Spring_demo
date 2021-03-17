package com.luv2code.springsecurity.demo.controller;

import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import com.luv2code.springsecurity.demo.entity.User;
import com.luv2code.springsecurity.demo.entity.User2;
import com.luv2code.springsecurity.demo.service.UserService;

@Controller
public class DemoController {
	
	private UserService userService;
	
	public DemoController(UserService theEmployeeService) {
		userService = theEmployeeService;
	}

	//after login, show the page to choose according the rigth's user(roles)
	@GetMapping("/")
	public String showHome() {
		
		//login page the spring(demo security) show by default 
		return "home";
	}
	
	//show the index page 
	@GetMapping("/homepage")
	public String showHomePage() {
		
		//homepage(botstrap)
		return "index";
	}
	
	//show the index page 
	
	@GetMapping("/search")
	public String search(@RequestParam("employeeName") String theName,
						 Model theModel) {
		
		
		User theEmployees = userService.findByUserName(theName);
		
		// add to the spring model
		theModel.addAttribute("users", theEmployees);
		
		// send to /employees/list
		return "/user-list";
		
	}
	
//	NEW METHOD  for payment, security social, etc ******************************
	@GetMapping("/search2")
	public String search2(@RequestParam("employeeName2") String theName,
						 Model theModel) {
		
		
		User2 theEmployees2 = userService.findByUserName2(theName);
		
		// add to the spring model
		theModel.addAttribute("users2", theEmployees2);
		
		// send to /employees/list
		return "/user_list2";
		
	}
	
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		// get employees from db
		List<User> theEmployees = userService.findAll();
		
		// add to the spring model
		theModel.addAttribute("users", theEmployees);
		
		return "/user-list";
	}
	
	//	NEW METHOD  for payment, security social, etc ******************************
	@GetMapping("/list2")
	public String listEmployees2(Model theModel) {
		
		// get employees from db
		List<User> theEmployees = userService.findAll();
		
		// add to the spring model
		theModel.addAttribute("users", theEmployees);
		
		return "/user_list2";
	}
	
	//add an  user by Id
	@GetMapping("/delete")
	public String delete(@RequestParam("userId") int theId) {
		
		// delete the employee
		userService.deleteById(theId);
		
		// redirect to /employees/list
		return "redirect:/list";
		
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute("users") User theUser) {
		
		// save the employee
		userService.update(theUser);
		
		// use a redirect to prevent duplicate submissions
		return "redirect:/list";
	}
	
	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("userId") int theId,
									Model theModel) {
		
		// get the employee from the service
		User theUser = userService.findById(theId);
		
		// set employee as a model attribute to pre-populate the form
		theModel.addAttribute("users", theUser);
		
		// send over to our form
		return "/users-form";			
	}
	
	
	// add request mapping for /leaders
	@GetMapping("/leaders")
	public String showLeaders() {
		
		return "leaders";
	}
	
	// add request mapping for /systems	
	@GetMapping("/systems")
	public String showSystems() {
		
		return "systems";
	}
	
	
	
}










