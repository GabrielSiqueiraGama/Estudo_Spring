package br.com.zhant.estudo_spring.models.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.zhant.estudo_spring.models.entities.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{

}
