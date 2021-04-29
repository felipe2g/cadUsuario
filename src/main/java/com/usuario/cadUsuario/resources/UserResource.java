package com.usuario.cadUsuario.resources;

import java.time.LocalDate;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.usuario.cadUsuario.entities.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1L, "Felipe Guimarães", "felipe@gmail.com", "123.123.123-12", LocalDate.parse("1996-06-24"));
		return ResponseEntity.ok().body(u);
	}
}
