package com.projetoSpringRicardo.cursoSpring03.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import com.projetoSpringRicardo.cursoSpring03.entities.User;
import com.projetoSpringRicardo.cursoSpring03.repositories.UserRepository;
import com.projetoSpringRicardo.cursoSpring03.services.exceptions.DataBaseException;
import com.projetoSpringRicardo.cursoSpring03.services.exceptions.ResourceNotFoundException;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public List<User> findAll() {
		return repository.findAll();
	}

	public User findById(Long id) {
		Optional<User> obj = repository.findById(id);
		return obj.orElseThrow(() -> new ResourceNotFoundException(id));
	}

	public User insert(User user) {
		return repository.save(user);
	}

	public void delete(Long id) {
		try {
			repository.deleteById(id);
		} catch (EmptyResultDataAccessException  e) {
			throw new ResourceNotFoundException(id); 
		}catch (DataIntegrityViolationException e) {
			throw new DataBaseException(e.getMessage());
		}

	}
	
	public User update(Long id, User obj) {
		User entity = repository.getReferenceById(id);
		updateData(entity,obj);
		return repository.save(entity);
	}

	private void updateData(User entity, User obj) {
		entity.setName(obj.getName());
		entity.setEmail(obj.getEmail());
		entity.setPhone(obj.getPhone());
	}

}