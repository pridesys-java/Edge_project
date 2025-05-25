package com.edge.service;

import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.edge.entity.Student;
import com.edge.repository.StudentRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class StudentService {
	private final StudentRepo repo;

	public List<Student> getAllData() {
		return repo.findAll();
	}

	public Optional<Student> getById(Long id) {
		return repo.findById(id);
	}

	@Transactional
	public void addStudent(Student stu) {
		try {
			repo.save(stu);
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // re-throw or handle properly
		}
	}

	@Transactional
	public void removeStudent(Student stu) {
		try {
			repo.delete(stu);
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // re-throw or handle properly
		}
	}

}
