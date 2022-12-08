package com.projetoSpringRicardo.cursoSpring03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projetoSpringRicardo.cursoSpring03.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
