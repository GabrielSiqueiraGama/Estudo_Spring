package br.com.zhant.estudo_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/calculator")
public class CalculatorController {

	@GetMapping("/sum/{a}/{b}")
	public int sum(@PathVariable int a, @PathVariable int b) {
		return a + b;
	}
	
	@GetMapping("/minus")
	public int minus(@RequestParam(name = "a") int a,@RequestParam(name = "b") int b) {
		return a - b;
	}
}
