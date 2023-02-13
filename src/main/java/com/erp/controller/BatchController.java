package com.erp.controller;

import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.erp.model.Batch;
import com.erp.service.BatchService;

@RestController
public class BatchController {

	@Autowired
	BatchService batchService;
	
	@PostMapping("/addBatch")
	public Batch addBatch(@RequestBody Batch batch) {
		return batchService.addBatch(batch);
	}
	
	@GetMapping("/getBatch/{batchId}")
	public Batch addBatch(@PathVariable Long batchId) throws Exception {
		return batchService.getBatch(batchId);
	}

	@GetMapping("/getBatches")
	public List<Batch> addBatches() {
		return (List<Batch>) batchService.getBatches();
	}
	
	@PutMapping("/assignStudentToBatch/{studentId}/{batchId}")
	public Batch assignStudentToBatch(@PathVariable Long studentId,
									  @PathVariable Long batchId){
		return  batchService.assignStudentToBatch(studentId,batchId);
	}
	
	@PutMapping("/updateBatch/{batchId}")
	public Batch updateBatch(@PathVariable Long batchId, @RequestBody Batch batch){
		return  batchService.updateBatch(batchId, batch);
	}
	
}
