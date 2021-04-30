package com.usuario.cadUsuario.services;

import java.util.Objects;

import javax.persistence.NonUniqueResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usuario.cadUsuario.custom.exception.BusinessException;
import com.usuario.cadUsuario.entities.User;
import com.usuario.cadUsuario.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	public User findById(Long id) {
		User user = repository.findById(id).get();
		Objects.requireNonNull(user, "Usuário não encontrado");
		
		return user;
	}
	
	public User insert(User obj) {
		try {
			if(obj.getEmail() != null && !obj.getEmail().isEmpty()) {
				User savedUser = repository.save(obj);
				
				return savedUser;
			}
			
			if(obj.getEmail() == null || obj.getEmail().isEmpty()) {
				throw new BusinessException("601", "Please send proper email.");
			}
			
			if(obj.getCpf() == null || obj.getCpf().isEmpty()) {
				throw new BusinessException("602", "Please send proper CPF.");
			}
			
			throw new BusinessException("603", "Uncategorized error.");
			
		} catch(NonUniqueResultException e) {
			e.printStackTrace();
			throw new BusinessException("604", "User already registered.");
		} catch(Exception e) {
			e.printStackTrace();
			throw new BusinessException("605", "Something wrong.");
		}
	}
}
