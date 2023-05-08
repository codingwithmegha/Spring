package com.megha.batch4119.h2.springboot.StudentB4119SB.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.megha.batch4119.h2.springboot.StudentB4119SB.model.Student;

@Repository
public interface StudentRepositiory extends JpaRepository<Student,Long>{

}
