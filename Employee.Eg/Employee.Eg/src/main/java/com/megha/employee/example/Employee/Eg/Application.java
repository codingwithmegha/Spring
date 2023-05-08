package com.megha.employee.example.Employee.Eg;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.megha.employee.example.Employee.Eg.model.Employee;
import com.megha.employee.example.Employee.Eg.repository.EmployeeRepository;

@SpringBootApplication
public class Application  implements CommandLineRunner {
	 @Autowired
		EmployeeRepository sr;
		public static void main(String[] args) {
			SpringApplication.run(Application.class, args);
		}
		@Override
		public void run(String... args) throws Exception {
			sr.save(new Employee("Megha Tomar",50000,"megha@gmail.com","Ghaziabad"));
	        sr.save(new Employee("Sana Saifi",60000,"Sana@gmail.com","Ghaziabad"));
			sr.save(new Employee("Madhuri Dixit",55000,"madhuri@gmail.com","Ghaziabad"));
	        sr.save(new Employee("Ritu",60000,"Ritu@gmail.com","Ghaziabad"));
		}
}
