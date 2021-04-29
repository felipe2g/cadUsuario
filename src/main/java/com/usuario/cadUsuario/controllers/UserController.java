package com.usuario.cadUsuario.controllers;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.cadUsuario.models.User;
import com.usuario.cadUsuario.repositories.UserRepository;

@RestController
//TODO - SWAGGER - API VALUE
@RequestMapping(value="/user")
public class UserController {

	@Autowired
	UserRepository userRepository;
	
	
	@GetMapping("/{id}")
	//TODO - SWAGGER API OPERATION
	public User showUser(@PathVariable(value="id") UUID id) {
		return userRepository.findById(id);
	}
}
