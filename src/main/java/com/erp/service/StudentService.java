package com.erp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.model.Student;
import com.erp.repo.StudentRepo;

@Service
public class StudentService {

	@Autowired
	StudentRepo studentRepo;

	public Student addStudent(Student student) {
		return studentRepo.save(student);
	}

	public List<Student> getStudent(Long studentId) {
		if (studentId != null) {
			return studentRepo.findAllByStudentId(studentId);
		} else {
			return studentRepo.findAll();
		}
	}

}
