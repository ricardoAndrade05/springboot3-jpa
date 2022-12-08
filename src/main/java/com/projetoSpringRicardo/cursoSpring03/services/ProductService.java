package com.projetoSpringRicardo.cursoSpring03.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoSpringRicardo.cursoSpring03.entities.Category;
import com.projetoSpringRicardo.cursoSpring03.entities.Product;
import com.projetoSpringRicardo.cursoSpring03.entities.User;
import com.projetoSpringRicardo.cursoSpring03.repositories.CategoryRepository;
import com.projetoSpringRicardo.cursoSpring03.repositories.ProductRepository;

@Service
public class ProductService {
	
	@Autowired
	private ProductRepository repository;
	
	public List<Product> findAll(){
		return repository.findAll();
	}
	
	public Product findById(Long id) {
		Optional<Product> obj = repository.findById(id);
		return obj.get();
	}

}
