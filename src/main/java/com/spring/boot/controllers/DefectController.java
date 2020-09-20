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

import com.spring.boot.converters.DefectConverter;
import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;
import com.spring.boot.services.DefectService;



@RestController
@RequestMapping(value ="api/v1")

public class DefectController {
	
	@Autowired
	private DefectService defectService;
	
	@PostMapping(value = "/defect")
	public ResponseEntity<Object> addEmployee(@RequestBody DefectDto defectDto) {
		defectService.addDefect(DefectConverter.defectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
	
	@GetMapping(value = "/defect")
	public List<Defect> getdefect(){
		return defectService.getdefect();
	}
	
	@GetMapping(value = "/defect/{defectid}")
	public Optional<Defect> getdefects(@PathVariable("defectid") Long defectid) {
	return defectService.getdefects(defectid);	
	
	}
	
	@DeleteMapping(value = "/defect")
	public ResponseEntity<Object> deletedefect(){
		defectService.deletedefect();
		return new ResponseEntity<Object>("delete Successfully", HttpStatus.CREATED);
	}
	
	@DeleteMapping(value = "/defect/{defectid}")
	public ResponseEntity<Object> deletedefects(@PathVariable("defectid")Long defectid){
		defectService.deletedefects(defectid);
		return new ResponseEntity<Object>("deleteid Successfully", HttpStatus.CREATED);	
		
	}
	
	@PutMapping(value = "/defect")
	public ResponseEntity<Object> addEmployee1(@RequestBody DefectDto defectDto) {
		defectService.addDefect(DefectConverter.defectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Update Successfully", HttpStatus.OK);
	}
	
	
	
	}
	
	

