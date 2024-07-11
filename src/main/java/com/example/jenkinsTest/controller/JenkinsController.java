package com.example.jenkinsTest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JenkinsController {
	
	@RequestMapping("/")
	public String getTestJsp() {
		return "test";
	}
	
}
