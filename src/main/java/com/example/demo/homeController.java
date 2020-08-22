package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class homeController {
	
	@Autowired
	customerRepo repo;
	
	ModelAndView mv;
	
	@RequestMapping("/")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/register")
	public String registerPage() {
		return "register";
	}
	
	@RequestMapping("/addCustomer")
	public ModelAndView register(Customer customer) {
		mv = new ModelAndView("end");
		mv.addObject("c", customer);
		repo.save(customer);
		return mv;
		
	}

}
