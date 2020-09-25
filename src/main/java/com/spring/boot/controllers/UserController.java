package com.spring.boot.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.UserConvertor;
import com.spring.boot.dto.UserDto;
import com.spring.boot.entities.User;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value = "api/v1")
public class UserController {

	@Autowired
	private UserService userService;

	@PostMapping(value = "/adduser")
	public ResponseEntity<Object> addEmployee(@RequestBody UserDto userDto) {
		userService.addUser(UserConvertor.userDtoToUser(userDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@DeleteMapping(value = "/deleteuser/{Uid}")
	public String deleteById(@PathVariable Long Uid) {
		userService.deleteUser(Uid);
		return "Successfully deleted";
	}

	@PutMapping(value = "/updateuser")
	public ResponseEntity<Object> updateEmployee(@RequestBody UserDto userDto) {
		userService.addUser(UserConvertor.userDtoToUser(userDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value = "/getall")
	public List<User> getall(User user) {
		return userService.getAll();
	}

	@GetMapping(value = "/getuserid/{Uid}")
	public User getbyiduser(@PathVariable Long Uid) {
		return userService.getUser(Uid);

	}

	@GetMapping(value = "/user/project-id/{id}")
	public List<User> getUserByProjectId(Long id) {
		return userService.getAllUserByProjectId(id);
	}

}
