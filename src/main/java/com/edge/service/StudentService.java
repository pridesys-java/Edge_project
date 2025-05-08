package com.edge.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edge.entity.Student;
import com.edge.repository.StudentRepo;

import jakarta.transaction.Transactional;

@Service
public class StudentService {

	@Autowired
	private StudentRepo repo;
	
	public List<Student> getAllData(){
		return repo.findAll();
	}
	
	public Optional<Student> getById(Long id){
		return repo.findById(id);
	}

	@Transactional
	public Optional<Student> addStudent(Student stu) {
		repo.save(stu);
		return  getById(stu.getId());
	}
}
