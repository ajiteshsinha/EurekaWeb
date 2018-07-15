package com.ajitesh.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;

import com.ajitesh.model.Greeting;

@Controller
@RequestMapping("/eureka/web")
public class HomeController {
	
	@Autowired
	RestTemplate rt;
	
	
	@GetMapping("/home")
	public String home(Model model) {
		
		ResponseEntity<Greeting> response = rt.getForEntity("http://eureka-client/eureka/client/greeting", Greeting.class);
		model.addAttribute("greeting", response.getBody());
		return "home";
	}

}
