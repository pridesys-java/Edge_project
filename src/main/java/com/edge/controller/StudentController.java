package com.edge.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.edge.entity.Student;
import com.edge.service.StudentService;

import jakarta.validation.Valid;

@RestController
public class StudentController {
	@Autowired
	private StudentService service;

	@GetMapping("/get-student")
	public List<Student> getAllData() {
		return service.getAllData();
	}
	
	@PostMapping("/add-student")
	public Optional<Student> addStudent( @Valid @RequestBody Student stu) {
		service.addStudent(stu);
		return service.getById(stu.getId());
	}
	
	@GetMapping("/test")
	public String testException(@RequestParam(required = false) String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input is required!");
        }
        if (input.equals("fail")) {
            throw new RuntimeException("Unexpected failure!");
        }
        return "Input received: " + input;
    }
	
	
}
