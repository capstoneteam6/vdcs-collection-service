package com.team6.dairy.vdcscollectionservice.entity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FarmerRepository extends JpaRepository<Farmer, Long> {
	List<Farmer> findAll();
}