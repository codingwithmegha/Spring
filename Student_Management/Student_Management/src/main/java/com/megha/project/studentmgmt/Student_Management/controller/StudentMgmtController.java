package com.megha.project.studentmgmt.Student_Management.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megha.project.studentmgmt.Student_Management.model.StudentManagement;
import com.megha.project.studentmgmt.Student_Management.repository.StudentMgmtRepository;

@RestController
@RequestMapping("/student")

public class StudentMgmtController {
	@Autowired
	StudentMgmtRepository bmr;
	@PostMapping("/save")
	public void saveStudent(@RequestBody StudentManagement sm) {
	bmr.save(sm);
	}
	@RequestMapping("/details")
	public List<StudentManagement> getStudents() {
	return bmr.findAll();
	}
	@RequestMapping("/update/{id}/{StudentName}")
	public void updateStudent(@PathVariable("id")Long id,@PathVariable("studentName")String course) {
	StudentManagement bmt = bmr.findById(id).get();
	bmt.setStudentName(course);
	bmr.save(bmt);
	}
	@RequestMapping("/details/{id}")
	public StudentManagement getById(@PathVariable("id")Long id) {
	return bmr.findById(id).get();
	}
	@RequestMapping("/delete/{id}")
	public void deleteStudent(@PathVariable("id")Long id) {
	bmr.deleteById(id);
	}

}
