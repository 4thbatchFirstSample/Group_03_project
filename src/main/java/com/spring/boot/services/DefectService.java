package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import com.spring.boot.entities.Defect;

public interface DefectService {

	public void addDefect(Defect defect);
	
	public List<Defect> getdefect();

	public Optional<Defect> getdefects(Long defectid);

	public void deletedefect();

	public void deletedefects(Long defectid);




}
