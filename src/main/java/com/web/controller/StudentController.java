package com.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.web.entity.StudentModel;
import com.web.service.StudentService;
@CrossOrigin 
@RestController
public class StudentController {

	@Autowired
	private StudentService service;
	
	@PostMapping("/save")
	public String save(@RequestBody StudentModel stu) {
		service.saveStudent(stu);
		return "student added successfully";
	}
	
	@GetMapping("/getAll")
	public List<StudentModel>getAll(){
		List<StudentModel>stdAll=service.getAllStudent();
		return stdAll;
	}
    
	@GetMapping("/getStudent/{stdName}")
	public List<StudentModel>getStudentByName(@PathVariable String stdName){
		return service.getStudentByName(stdName);
	}
	
 
	
	@DeleteMapping("/delete/{stdName}")
	public Integer deleteStudent(@PathVariable String stdName) {
		
		 return service.deletByStudentName(stdName); 
		
	}
	
	
	@GetMapping("/get/{stdEmail}/{stdId}")
	public List<StudentModel> getStudent(@PathVariable String stdEmail,@PathVariable Integer stdId){
		return service.findByStdEmailAndStdId(stdEmail, stdId);
	}
 
	
            @GetMapping("/getAllUsingJpql")
           public List<StudentModel> getAllUsingJpql(){
            	List<StudentModel>stdAllStudent=service.getAllUsersUsingJpql();
            	return stdAllStudent;
}
            
            @GetMapping("/getWith/{city}/{stdName}")
            public List<StudentModel> findByCityNamewithIndexName(@PathVariable String city, @PathVariable String stdName){
            	return service.findByCityWithIndexName(city, stdName);
            }

	
}
