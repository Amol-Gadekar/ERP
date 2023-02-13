package com.erp.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.erp.model.Batch;

@Repository
public interface BatchRepo extends JpaRepository<Batch, Long>{

	List<Batch> findAllByBatchId(Long batchId);
	
}
