package com.usuario.cadUsuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.cadUsuario.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
