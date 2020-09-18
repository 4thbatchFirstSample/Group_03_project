package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.UserConvertor;
import com.spring.boot.dto.UserDto;
import com.spring.boot.repositories.UserRepository;
import com.spring.boot.services.UserService;

@RestController
@RequestMapping(value ="api/v1")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@PostMapping(value = "/adduser")
	public ResponseEntity<Object> addEmployee(@RequestBody UserDto userDto) {
		userService.addUser(UserConvertor.userDtoToUser(userDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
	
	@DeleteMapping(value="/deleteuser/{Uid}")
	void deleteUser(@PathVariable Long Uid) {
		userService.deleteUser(Uid);
	}
	
	@GetMapping(value="getbyiduser/{Uid}")
	void getByID(@PathVariable Long Uid) {
		userService.getUser(Uid);
	}
	
	
	

	
}