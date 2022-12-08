package com.projetoSpringRicardo.cursoSpring03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoSpringRicardo.cursoSpring03.entities.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}
