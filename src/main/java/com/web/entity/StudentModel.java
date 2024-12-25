package com.web.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

 
@Entity
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Table(name="student_model")
public class StudentModel {
	@Id
	private Integer stdId;
	
	private String stdName;
	
	private String stdEmail;
	
	private String city;
 
}
