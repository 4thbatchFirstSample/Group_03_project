package com.spring.boot.services;

import java.util.List;
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
		userRepository.deleteById(Uid);

	}

	@Override
	public void updateUser(Long uid) {

	}

	@Override
	public User getUser(Long Uid) {
		// TODO Auto-generated method stub
		return userRepository.findById(Uid).get();
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return userRepository.findAll();
	}

	@Override
	public List<User> getAllUserByProjectId(Long id) {
		return userRepository.findByProjectId(id);
	}

}
