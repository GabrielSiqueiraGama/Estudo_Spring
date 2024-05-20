package br.com.zhant.estudo_spring.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.zhant.estudo_spring.models.entities.Product;
import br.com.zhant.estudo_spring.models.repositories.ProductRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductRepository productRepository;
	
	@PostMapping
	public @ResponseBody Product newProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
}
