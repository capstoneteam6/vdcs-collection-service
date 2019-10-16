package com.team6.dairy.vdcscollectionservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.team6.dairy.vdcscollectionservice.entity.Farmer;
import com.team6.dairy.vdcscollectionservice.entity.FarmerRepository;
import com.team6.dairy.vdcscollectionservice.entity.Vdcs;
import com.team6.dairy.vdcscollectionservice.entity.VdcsCollection;
import com.team6.dairy.vdcscollectionservice.entity.VdcsCollectionRepository;
import com.team6.dairy.vdcscollectionservice.entity.VdcsRepository;

@SpringBootApplication
public class VdcsCollectionServiceApplication implements CommandLineRunner {

	@Autowired
	private FarmerRepository farmerRepository;
	
	@Autowired
	private VdcsRepository vdcsRepository;
	
	@Autowired
	private VdcsCollectionRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(VdcsCollectionServiceApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {

		long vdcs_count = vdcsRepository.count();
		if (vdcs_count == 0) {
			vdcsRepository.save(new Vdcs("V0001", "VDCS 1", "Delhi 1", 123456));
			vdcsRepository.save(new Vdcs("V0002", "VDCS 2", "Delhi 2", 234567));
		}

		long farmer_count = farmerRepository.count();
		if (farmer_count == 0) {
			farmerRepository.save(new Farmer("F0001", "Ram", "Delhi 1", 123456, "V0001"));
			farmerRepository.save(new Farmer("F0002", "Shyam", "Delhi 2", 234567, "V0002"));
			farmerRepository.save(new Farmer("F0003", "Prakash", "Delhi 3", 345678, "V0001"));
			farmerRepository.save(new Farmer("F0004", "Shubhash", "Delhi 4", 456789, "V0002"));
		}	
		
		long collection_count = repository.count();
		if (collection_count == 0) {
			repository.save(new VdcsCollection( "IN0001", "V0001", "F0001", 100, 10, "10/10/2019", "10:10" ));
			repository.save(new VdcsCollection( "IN0002", "V0001", "F0003", 150, 15, "10/10/2019", "10:20" ));
			repository.save(new VdcsCollection( "IN0003", "V0002", "F0002", 110, 12, "10/10/2019", "10:30" ));
			repository.save(new VdcsCollection( "IN0004", "V0002", "F0004", 120, 10, "10/10/2019", "10:40" ));
			repository.save(new VdcsCollection( "IN0005", "V0001", "F0001", 120, 15, "11/10/2019", "10:10" ));
			repository.save(new VdcsCollection( "IN0006", "V0001", "F0003", 150, 10, "11/10/2019", "10:20" ));
			repository.save(new VdcsCollection( "IN0007", "V0002", "F0002", 130, 12, "11/10/2019", "10:30" ));
			repository.save(new VdcsCollection( "IN0008", "V0002", "F0004", 140, 10, "11/10/2019", "10:40" ));
		}
	}
}
