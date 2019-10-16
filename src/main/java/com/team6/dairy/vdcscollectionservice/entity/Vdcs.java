package com.team6.dairy.vdcscollectionservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vdcs {

	@Id
	private String vdcsId;
	private String vdcsName;
	private String vdcsAddress;
	private Integer vdcsPinCode;
	
	public Vdcs() {}
	
	public Vdcs(String vdcsId, String vdcsName, String vdcsAddress, Integer vdcsPinCode) {
		super();
		this.vdcsId = vdcsId;
		this.vdcsName = vdcsName;
		this.vdcsAddress = vdcsAddress;
		this.vdcsPinCode = vdcsPinCode;
	}
	
	public String getVdcsId() {
		return vdcsId;
	}
	public void setVdcsId(String vdcsId) {
		this.vdcsId = vdcsId;
	}
	public String getVdcsName() {
		return vdcsName;
	}
	public void setVdcsName(String vdcsName) {
		this.vdcsName = vdcsName;
	}
	public String getVdcsAddress() {
		return vdcsAddress;
	}
	public void setVdcsAddress(String vdcsAddress) {
		this.vdcsAddress = vdcsAddress;
	}
	public Integer getVdcsPinCode() {
		return vdcsPinCode;
	}
	public void setVdcsPinCode(Integer vdcsPinCode) {
		this.vdcsPinCode = vdcsPinCode;
	}		
}
