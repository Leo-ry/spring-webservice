package com.leona.webservice.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebRestController {
	
	@GetMapping("/hello")
	public String hello() {
		return "HelloWorld";
	}
}
