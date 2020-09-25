package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.User;

public interface UserService {

	public void addUser(User user);

	public void deleteUser(Long Uid);

	public User getUser(Long Uid);

	public void updateUser(Long Uid);

	public List<User> getAll();

	public List<User> getAllUserByProjectId(Long id);

}
