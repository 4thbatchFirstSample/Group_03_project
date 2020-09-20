package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.spring.boot.entities.Defect;
import com.spring.boot.repositories.Defectrepository;
import org.springframework.stereotype.Service;
@Service
public class DefectServicelmpl implements DefectService{
	
	@Autowired
	private Defectrepository defectrepository;

	@Override
	public void addDefect(Defect defect) {
		defectrepository.save(defect);
		
	}

	@Override
	public List<Defect> getdefect() {
		return defectrepository.findAll();
	}

	@Override
	public Optional<Defect> getdefects(Long defectid) {
		return defectrepository.findById(defectid);
	}

	@Override
	public void deletedefect() {
		defectrepository.deleteAll();
		
	}

	@Override
	public void deletedefects(Long defectid) {
		defectrepository.deleteById(defectid);
		
	}


	

	
	

	
	

}
