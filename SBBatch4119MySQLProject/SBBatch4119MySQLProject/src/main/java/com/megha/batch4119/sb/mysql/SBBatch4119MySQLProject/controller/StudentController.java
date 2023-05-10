package com.megha.batch4119.sb.mysql.SBBatch4119MySQLProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megha.batch4119.sb.mysql.SBBatch4119MySQLProject.model.Student;
import com.megha.batch4119.sb.mysql.SBBatch4119MySQLProject.repository.StudentRepository;

@RestController
@RequestMapping("/student")
public class StudentController {
@Autowired
StudentRepository sr;
@PostMapping("/save")
public void saveEmployee(@RequestBody Student emp) {
	
}
}
