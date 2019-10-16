package com.team6.dairy.vdcscollectionservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Farmer {

	@Id
	private String farmerId;
	private String farmerName;
	private String farmerAddress;
	private Integer farmerPinCode;
	private String vdcsId;
	
	public Farmer() {}
	
	public Farmer(String farmerId, String farmerName, String farmerAddress, Integer farmerPinCode, String vdcsId) {
		super();
		this.farmerId = farmerId;
		this.farmerName = farmerName;
		this.farmerAddress = farmerAddress;
		this.farmerPinCode = farmerPinCode;
		this.vdcsId = vdcsId;		
	}
	
	
	public String getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public String getFarmerName() {
		return farmerName;
	}
	public void setFarmerName(String farmerName) {
		this.farmerName = farmerName;
	}
	public String getFarmerAddress() {
		return farmerAddress;
	}
	public void setFarmerAddress(String farmerAddress) {
		this.farmerAddress = farmerAddress;
	}
	public Integer getFarmerPinCode() {
		return farmerPinCode;
	}
	public void setFarmerPinCode(Integer farmerPinCode) {
		this.farmerPinCode = farmerPinCode;
	}
	public String getVdcsId() {
		return vdcsId;
	}
	public void setVdcsId(String vdcsId) {
		this.vdcsId = vdcsId;
	}	
}
