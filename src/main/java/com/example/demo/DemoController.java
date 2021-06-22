package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/demo/")
@RestController
public class DemoController {
	
	@RequestMapping(value = "/say", method = RequestMethod.GET)
	public String greetings() {
		return "Hello World";
	}

}
