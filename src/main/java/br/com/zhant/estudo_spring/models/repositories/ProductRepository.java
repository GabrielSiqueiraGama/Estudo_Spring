package br.com.zhant.estudo_spring.models.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.zhant.estudo_spring.models.entities.Product;

public interface ProductRepository  extends JpaRepository<Product, Integer>{

	public Iterable<Product> findByNameContaining(String partName);
}
