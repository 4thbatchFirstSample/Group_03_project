package com.spring.boot.services;

import java.util.Optional;

import com.spring.boot.entities.User;

public interface UserService {
	
	public void addUser(User user);
	public void deleteUser(Long Uid);
	public Optional<User> getUser(Long Uid);
	public void updateUser(Long Uid);
	

}
