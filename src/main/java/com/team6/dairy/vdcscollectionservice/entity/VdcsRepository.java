package com.team6.dairy.vdcscollectionservice.entity;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VdcsRepository extends JpaRepository<Vdcs, Long> {
	List<Vdcs> findAll();
}
