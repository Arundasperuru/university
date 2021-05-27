package com.tech.university.dto;

public class UniversityDTO {
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
