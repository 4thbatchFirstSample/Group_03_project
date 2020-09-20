package com.spring.boot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.User;
import com.spring.boot.repositories.UserRepository;

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
		
		
	}

	@Override
	public void deleteUser(Long Uid) {
		userRepository.deleteById( Uid);
		
		
	}

	@Override
	public Optional<User> getUser(Long Uid) {
		
		return userRepository.findById(Uid);
		
	}

	@Override
	public void updateUser(Long uid) {
		
		
	}

}
