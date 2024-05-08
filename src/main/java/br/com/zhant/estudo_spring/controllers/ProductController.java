package br.com.zhant.estudo_spring.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.zhant.estudo_spring.models.entities.Product;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@PostMapping
	public Product newProduct(String name) {
		Product product = new Product(name);
		
		return product;
	}
}
