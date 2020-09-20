package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defect;


@Service
public class DefectConverter {
	
	// projectDto to Project Entity Converter
		public static Defect defectDtoToDefect(DefectDto defectDto) {
			Defect defect = new Defect();
			if (defectDto != null) {
				defect.setId(defectDto.getId());
				defect.setName(defectDto.getName());
				defect.setServerity(defectDto.getServerity());
				defect.setPriority(defectDto.getPriority());
				defect.setDetails(defectDto.getDetails());
				defect.setFounddate(defectDto.getFounddate());
				return defect;
			}
			return null;
		}

		// Project to ProjectDto list converter

		public static List<DefectDto> defectToDefectDto(List<Defect> defectList) {
			List<DefectDto> listDefectDto = new ArrayList<>();
			if (defectList != null) {
				for (Defect defect : defectList) {
					DefectDto defectDto = new DefectDto();
					defectDto.setId(defect.getId());
					defectDto.setName(defect.getName());
					defectDto.setServerity(defect.getServerity());
					defectDto.setPriority(defect.getPriority());
					defectDto.setDetails(defect.getDetails());
					defectDto.setFounddate(defect.getFounddate());

					listDefectDto.add(defectDto);
				}
				return listDefectDto;
			}
			return null;

		}


}
