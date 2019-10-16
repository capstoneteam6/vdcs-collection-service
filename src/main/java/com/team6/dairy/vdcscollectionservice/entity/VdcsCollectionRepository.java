package com.team6.dairy.vdcscollectionservice.entity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VdcsCollectionRepository extends JpaRepository<VdcsCollection, Long> {
	List<VdcsCollection> findAll();
}