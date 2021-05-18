package com.lbasoftware.webproject.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class useController {
	
	@GetMapping("/user")
	@ResponseBody
	public String userLink()
	{
		return "hello";
	}
	

}
