package com.team6.dairy.vdcscollectionservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.team6.dairy.vdcscollectionservice.entity.Farmer;
import com.team6.dairy.vdcscollectionservice.entity.FarmerRepository;
import com.team6.dairy.vdcscollectionservice.entity.Vdcs;
import com.team6.dairy.vdcscollectionservice.entity.VdcsCollection;
import com.team6.dairy.vdcscollectionservice.entity.VdcsCollectionRepository;
import com.team6.dairy.vdcscollectionservice.entity.VdcsRepository;

@RestController
public class VdcsCollectionService {

	@Autowired
	private FarmerRepository farmerRepository;
	
	@Autowired
	private VdcsRepository vdcsRepository;
	
	@Autowired
	private VdcsCollectionRepository repository;

	@GetMapping("/farmer-list")
	public List<Farmer> retrieveFarmerList() {
		List<Farmer> collectionData = farmerRepository.findAll();
		
		return collectionData;
	}

	@GetMapping("/vdcs-list")
	public List<Vdcs> retrieveVdcsList() {
		List<Vdcs> collectionData = vdcsRepository.findAll();
		
		return collectionData;
	}

	@GetMapping("/vdcs-collection")
	public List<VdcsCollection> retrieveVdcsCollection() {
		List<VdcsCollection> collectionData = repository.findAll();
		
		return collectionData;
	}
}
