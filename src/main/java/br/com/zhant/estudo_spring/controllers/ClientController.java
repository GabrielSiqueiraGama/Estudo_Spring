package br.com.zhant.estudo_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.zhant.estudo_spring.models.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@GetMapping("/list")
	public Client getClient() {
		return new Client(22, "Peter", "123.467.123-00");
	}
	
	@GetMapping("/{id}")
	public Client getClientById(@PathVariable int id) {
		return new Client(id, "Mary", "982.785.123-00");
	}
	@GetMapping
	public Client getClientById2(@RequestParam(name = "id") int id) {
		return new Client(id, "Jhon", "123.431.123-00");
	}
}
