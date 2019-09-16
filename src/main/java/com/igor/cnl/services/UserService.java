package com.igor.cnl.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.igor.cnl.entity.User;
import com.igor.cnl.repositories.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repo;
	
	public List<User> findAll(){
		return repo.findAll();
	}
	
	public User findById(Long id) {
		Optional<User> obj = repo.findById(id);
		return obj.get();
	}
}
