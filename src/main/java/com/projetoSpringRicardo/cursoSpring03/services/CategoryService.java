package com.projetoSpringRicardo.cursoSpring03.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projetoSpringRicardo.cursoSpring03.entities.Category;
import com.projetoSpringRicardo.cursoSpring03.entities.User;
import com.projetoSpringRicardo.cursoSpring03.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(Long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
