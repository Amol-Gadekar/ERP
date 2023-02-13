package com.erp.service;

import java.util.List;
import java.util.Optional;

import org.hibernate.sql.Update;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.erp.model.Batch;
import com.erp.model.Student;
import com.erp.repo.BatchRepo;
import com.erp.repo.StudentRepo;

@Service
public class BatchService {

	@Autowired
	BatchRepo batchRepo;

	@Autowired
	StudentRepo studentRepo;

	public Batch addBatch(Batch batch) {
		return batchRepo.save(batch);
	}

//	public List<Batch> getBatch(Long batchId) {
//		if (batchId != null) {
//			return batchRepo.findAllByBatchId(batchId);
//		} else {
//			return batchRepo.findAll();
//		}
//	}

	public Batch getBatch(Long batchId) throws Exception {
		return batchRepo.findById(batchId).orElseThrow(()->new Exception("Batch not found with id: "+batchId));
	}

	public Batch assignStudentToBatch(Long studentId, Long batchId) {

		List<Student> students = null;
		Student student = studentRepo.findById(studentId).get();
		Batch batch = batchRepo.findById(batchId).get();
		students = batch.getStudents();
		students.add(student);
		batch.setStudents(students);
		return batchRepo.save(batch);
	}

	public Batch updateBatch(Long batchId, Batch batch) {
		Batch b = batchRepo.findById(batchId).get();
		b.setBatchName(batch.getBatchName());
		b.setCourseName(batch.getCourseName());
		b.setStartD(batch.getStartD());
		b.setEndD(batch.getEndD());
		return batchRepo.save(b);
	}

	public List<Batch> getBatches() {
		return (List<Batch>) batchRepo.findAll();
	}

}
