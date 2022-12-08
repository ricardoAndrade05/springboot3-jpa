package com.projetoSpringRicardo.cursoSpring03.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.projetoSpringRicardo.cursoSpring03.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
