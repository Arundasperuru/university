package com.tech.university.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tech.university.dto.Response;
import com.tech.university.dto.UniversityDTO;
import com.tech.university.entity.UniversityEntity;
import com.tech.university.repository.UniversityRepo;

@Service
public class UniversityService {
	@Autowired
	UniversityRepo universityRepo;

	public Response saveData(UniversityDTO universityDto) {
		String str;
		str = universityDto.getUniversityName().toString();
		boolean isExists = universityRepo.existsByUniversityNameIgnoreCase(str);
		if (!isExists) {
			fetch(universityDto);
			Response er = new Response();
			er.setMessage("Success");
			return er;
		} else {
			Response er = new Response();
			er.setMessage("University Already registered");
			return er;
		}

	}

	public void fetch(UniversityDTO universityDto) {
		UniversityEntity entity = new UniversityEntity();
		entity.setUniversityName(universityDto.getUniversityName());
		entity.setUniversityLocation(universityDto.getUniversityLocation());
		universityRepo.save(entity);
	}

	public UniversityEntity getByName(String universityName) {
		return universityRepo.findByUniversityName(universityName);
	}
	
	public Response deleteById(Long id) {
		universityRepo.deleteById(id);
		Response er = new Response();
		er.setMessage("Deleted University of "+id+" Successfully");
		return er;
	}

}
