package com.tech.university.controller;

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

import com.tech.university.dto.Response;
import com.tech.university.dto.UniversityDTO;
import com.tech.university.entity.UniversityEntity;
import com.tech.university.service.UniversityService;

@RestController
@RequestMapping("university")
public class UniversityController {

	@Autowired
	UniversityService universityService;

	@PostMapping("/create")
	public Response create(@RequestBody UniversityDTO universityDto) {
		return universityService.saveData(universityDto);
	}

	@GetMapping("/get/{universityName}")
	public UniversityEntity getByName(@PathVariable String universityName) {
		return universityService.getByName(universityName);
	}
	
	@DeleteMapping("/delete/{id}")
	public Response deleteById(@PathVariable("id") Long id) {
		return universityService.deleteById(id);
	}

}
