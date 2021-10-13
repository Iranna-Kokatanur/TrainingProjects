package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Student;

import java.util.*;

import javax.transaction.Transactional;


@Repository
public interface StudentRepository extends JpaRepository<Student,Integer>{
	
	List<Student>findByStudentName(String srchname);
	
	@Query(nativeQuery = true,
			value="update student set markScored =:mark where rollNumber=:number")
	@Modifying
	@Transactional
	public int updateMark(@Param("number")int rollNumber,@Param("mark")double scoreToUpdate);
	
	
//	@Query(nativeQuery = true,
//			value="delete from student where rollNumber=:number")
//	@Modifying
//	@Transactional
//	public int deleteRow(@Param("number")int rollNumber);
//	
//	@Query(nativeQuery = true,
//			value="delete from student where studentName=:name")
//	@Modifying
//	@Transactional
//	public int deleteRowByName(@Param("name") String name);

}
