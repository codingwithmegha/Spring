package com.megha.project.studentmgmt.Student_Management.model;

import jakarta.persistence.*;

@Entity
@Table(name="student_mgmt")
public class StudentManagement {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="student_mgmt_id")
	private Long id;    //student's id #
	private String StudentName;  //student's name
	private String course; //student's course
	private int age;       //student's age
	private int year;      //student's year level
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getStudentName() {
		return StudentName;
	}

	public void setStudentName(String studentName) {
		StudentName = studentName;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public StudentManagement(String studentName, String course, int age, int year) {
		super();
		StudentName = studentName;
		this.course = course;
		this.age = age;
		this.year = year;
	}

	public StudentManagement() {
	}
}       