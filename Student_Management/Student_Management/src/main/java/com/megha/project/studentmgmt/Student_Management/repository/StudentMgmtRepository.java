package com.megha.project.studentmgmt.Student_Management.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megha.project.studentmgmt.Student_Management.model.StudentManagement;

@Repository
public interface StudentMgmtRepository extends JpaRepository<StudentManagement,Long> {

}
