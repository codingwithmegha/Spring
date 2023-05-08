package com.megha.batch4119.h2.springboot.StudentB4119SB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.megha.batch4119.h2.springboot.StudentB4119SB.model.Student;
import com.megha.batch4119.h2.springboot.StudentB4119SB.repository.StudentRepositiory;

@SpringBootApplication
public class StudentB4119SbApplication implements CommandLineRunner{
   @Autowired
	StudentRepositiory sr;
	public static void main(String[] args) {
		SpringApplication.run(StudentB4119SbApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		sr.save(new Student("Megha Tomar","Anudeep","megha@gmail.com"));
        sr.save(new Student("Sana Saifi","Anudeep","Sana@gmail.com"));
	}
}
