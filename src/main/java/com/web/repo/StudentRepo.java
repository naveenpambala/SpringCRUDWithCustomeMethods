package com.web.repo;

import java.util.List;


import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

 
import com.web.entity.StudentModel;

@Repository
public interface StudentRepo extends JpaRepository<StudentModel, Integer> {
	
	 

	
 
//navtive method  
	@Modifying
	@Transactional
	@Query(value="delete from student_model n where n.std_name=:std_name", nativeQuery=true) //database table name
	 public Integer deleteByStudentName(@Param("std_name") String stdName);
	
 

//native method	
	@Query(value="select * from student_model  where std_email=?1 and std_id=?2 ", nativeQuery=true)
	public List<StudentModel> findByStdEmailAndStdId(String stdEmail, Integer stdId);
	
	
	public List<StudentModel> findByStdName(String stdName);
	
	
	//jpql
	@Query("select s from StudentModel s")   //java table name
	public List<StudentModel> getAllUsersUsingJpql();

    
	 //jpql with index parameter
	
	@Query("select s from StudentModel s where s.city=?1 and s.stdName=?2")
	List<StudentModel> findByCityWithIndexName(String city, String stdName);



	 

}
