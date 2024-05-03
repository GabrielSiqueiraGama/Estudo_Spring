package br.com.zhant.estudo_spring.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/methods")
public class MethodsController {

	@GetMapping
	public String get() {
		return "Get method";
	}
	
	@PostMapping
	public String post() {
		return "Post method";
	}
	
	@PutMapping
	public String put() {
		return "Put method";
	}
	
	@PatchMapping
	public String patch() {
		return "Patch method";
	}
	
	@DeleteMapping
	public String delete() {
		return "Delete method";
	}
	
}
