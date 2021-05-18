package com.lbasoftware.webproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class controller {
	
	@RequestMapping("/")
	public String home()
	{
		System.out.println("goo home >>>");
		return "index";
	}
	
	@GetMapping("/hello")
	public String hello()
	{
		return "hello";
	}
//	@GetMapping({"/", "/index"})  
//	public String hello(Model model, @RequestParam(value="name", required=false, defaultValue="World") String name) {
//	  
//	          model.addAttribute("name", name);
//	  
//	          return "hello";
//	  
//	      }

}
