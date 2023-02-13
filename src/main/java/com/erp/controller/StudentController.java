package com.erp.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.model.Batch;
import com.erp.model.Student;
import com.erp.service.StudentService;

@RestController
public class StudentController {

	@Autowired
	StudentService studentService;
	
	@PostMapping("/addStudent")
	public Student addStudent(@RequestBody @Valid Student student) {
		return studentService.addStudent(student);
	}
	
	@GetMapping("/getStudent/{studentId}")
	public List<Student> addStudent(@PathVariable Long studentId) {
		return studentService.getStudent(studentId);
	}
	
}
