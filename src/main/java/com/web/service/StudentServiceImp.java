package com.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.web.entity.StudentModel;
import com.web.repo.StudentRepo;

@Service
public class StudentServiceImp implements StudentService {
	@Autowired
	private StudentRepo repo;

	@Override
	public StudentModel saveStudent(StudentModel stu) {
		 
		return repo.save(stu);
	}

	@Override
	public List<StudentModel> getAllStudent() {
	 
		List<StudentModel>std=repo.findAll();
		return std;
	}

	@Override
	public List<StudentModel> getStudentByName(String stdName) {
		
		return repo.findByStdName(stdName);
	}




	@Override
	public  Integer deletByStudentName(String stdName) {
		 
		return repo.deleteByStudentName(stdName);
		 
	}

 

	@Override
	public List<StudentModel> findByStdEmailAndStdId(String stdEmail, Integer stdId) {
		 
		return repo.findByStdEmailAndStdId(stdEmail,stdId);
	}

	@Override
	public List<StudentModel> getAllUsersUsingJpql() {
		
		return repo.getAllUsersUsingJpql();
	}

	@Override
	public List<StudentModel> findByCityWithIndexName(String city, String stdName) {
 
		return repo.findByCityWithIndexName(city, stdName);
		
	}
 
	
	

}
