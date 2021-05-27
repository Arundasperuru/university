package com.tech.university.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UniversityEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)

	private Long id;
	private String universityName;
	private String universityLocation;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUniversityName() {
		return universityName;
	}

	public void setUniversityName(String universityName) {
		this.universityName = universityName;
	}

	public String getUniversityLocation() {
		return universityLocation;
	}

	public void setUniversityLocation(String universityLocation) {
		this.universityLocation = universityLocation;
	}

}
