package com.spring.boot.services;

import com.spring.boot.entities.User;

public interface UserService {
	
	public void addUser(User user);
	public void deleteUser(Long Uid);
	public void getUser(Long Uid);
	public void updateUser(Long Uid);
	

}
