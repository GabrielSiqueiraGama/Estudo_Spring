package br.com.zhant.estudo_spring.controllers;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Product saveProduct(@Valid Product product) {
		productRepository.save(product);
		return product;
	}
	
	@GetMapping
	public Iterable<Product> getProducts() {
		return productRepository.findAll();
	}
	
	@GetMapping(path = "/page/{numberPage}")
	public Iterable<Product> getProductByPage(@PathVariable int numberPage){
		PageRequest page = PageRequest.of(0, 2);
		return productRepository.findAll(page);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Product> getProductsById(@PathVariable int id) {
		return productRepository.findById(id);
	}
	
	@GetMapping(path = "/name/{partName}")
	public Iterable<Product> getProductByName(@PathVariable String partName){
		return productRepository.findByNameContaining(partName);
	}
	
//	@PutMapping
//	public Product updateProduct(@Valid Product product) {
//		productRepository.save(product);
//		return product;
//	}
	@DeleteMapping(path = "/{id}")
	public void deleteProduct(@PathVariable int id) {
		productRepository.deleteById(id);
	}
}
