package com.megha.employee.example.Employee.Eg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.megha.employee.example.Employee.Eg.model.Employee;
import com.megha.employee.example.Employee.Eg.repository.EmployeeRepository;

@RestController
@RequestMapping("/student")
public class Employee_Controller {
	@Autowired
EmployeeRepository sr;
@RequestMapping("/details")
public List<Employee> getStudents(){
	return sr.findAll();
}
}
