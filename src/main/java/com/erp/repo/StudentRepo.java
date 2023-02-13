package com.erp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.model.Batch;
import com.erp.model.Student;

@Repository
public interface StudentRepo extends JpaRepository<Student, Long>{

	List<Student> findAllByStudentId(Long studentId);

	
}
