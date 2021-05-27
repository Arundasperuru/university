package com.tech.university.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.tech.university.entity.UniversityEntity;

@Repository
public interface UniversityRepo extends JpaRepository<UniversityEntity, Long>{
	UniversityEntity findByUniversityName(String universityName);
	boolean existsByUniversityNameIgnoreCase(String universityName);
	
//	@Query(value = "SELECT IF(COUNT(*) >0, TRUE,FALSE)as response FROM <univesityentity> WHERE universityname= ('universityName')",  nativeQuery = true)
//	public UniversityEntity findByUniversityName (String universityName);

}
