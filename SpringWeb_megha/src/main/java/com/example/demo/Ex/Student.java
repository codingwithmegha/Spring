package com.example.demo.Ex;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Student {
	@RequestMapping("/start")
	public String getName() {
		return "megha";

}
	}
