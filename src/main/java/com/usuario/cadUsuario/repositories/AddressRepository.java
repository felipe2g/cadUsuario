package com.usuario.cadUsuario.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usuario.cadUsuario.entities.Address;

public interface AddressRepository extends JpaRepository<Address, Long>{

}
