package br.com.zhant.estudo_spring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zhant.estudo_spring.models.Client;

@RestController
@RequestMapping("/clients")
public class ClientController {

	@GetMapping("/list")
	public Client getClient() {
		return new Client(22, "Peter", "123.467.123-00");
	}
}
