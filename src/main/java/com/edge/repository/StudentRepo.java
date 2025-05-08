package com.edge.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.edge.entity.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long> {

}
