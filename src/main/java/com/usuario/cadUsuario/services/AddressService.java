package com.usuario.cadUsuario.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.cadUsuario.entities.Address;
import com.usuario.cadUsuario.repositories.AddressRepository;

@Service
public class AddressService {
	
	@Autowired
	private AddressRepository repository;
	
	public Address insert(Address obj) {
		return repository.save(obj);
	}
}
