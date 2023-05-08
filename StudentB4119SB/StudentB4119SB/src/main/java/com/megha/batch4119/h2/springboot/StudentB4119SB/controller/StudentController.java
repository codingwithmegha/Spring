package com.megha.batch4119.h2.springboot.StudentB4119SB.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megha.batch4119.h2.springboot.StudentB4119SB.model.Student;
import com.megha.batch4119.h2.springboot.StudentB4119SB.repository.StudentRepositiory;

@RestController
@RequestMapping("/student")
public class StudentController {
	@Autowired
StudentRepositiory sr;
@RequestMapping("/details")
public List<Student> getStudents(){
	return sr.findAll();
}
}
 