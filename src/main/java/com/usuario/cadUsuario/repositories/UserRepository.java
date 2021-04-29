package com.usuario.cadUsuario.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.cadUsuario.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findById(UUID id);
}
