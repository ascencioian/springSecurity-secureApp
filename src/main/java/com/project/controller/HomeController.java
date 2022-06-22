package com.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HomeController {
	
	//-----------------------------------------getters
		@GetMapping("/")
		public String home() {
			
			
			return "index";
		}

	//-----------------------------------------login page for security
}
