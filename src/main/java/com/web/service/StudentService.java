package com.web.service;

import java.util.List;

import com.web.entity.StudentModel;

public interface StudentService {

	
	public StudentModel saveStudent(StudentModel stu);
	
	public List<StudentModel>getAllStudent();
	
	public List<StudentModel>getStudentByName(String stdName);
	
	public Integer deletByStudentName(String stdName);
	 
 	public List<StudentModel> findByStdEmailAndStdId(String stdEmail,Integer stdId);
	
 	public List<StudentModel>getAllUsersUsingJpql();
 	
 	public List<StudentModel> findByCityWithIndexName(String city, String stdName);
 

	
}
