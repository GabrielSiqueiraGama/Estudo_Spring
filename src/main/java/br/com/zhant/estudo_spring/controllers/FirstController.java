package br.com.zhant.estudo_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping(path = "/hello")
	public String printOla() {
		return "Hello Spring Boot";
	}
	
}
