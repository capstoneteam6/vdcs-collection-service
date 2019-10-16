package com.team6.dairy.vdcscollectionservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class VdcsCollection {
	
	@Id
	private String invoiceId;
	private String vdcsId;
	private String farmerId;
	private Integer quantity;
	private Integer fat;
	private String collectionDate;
	private String collectionTime;
	
	public VdcsCollection() {}
	
	public VdcsCollection(String invoiceId, String vdcsId, String farmerId, Integer quantity, Integer fat, String collectionDate, String collectionTime) {
		super();
		this.invoiceId = invoiceId;
		this.vdcsId = vdcsId;
		this.farmerId = farmerId;
		this.quantity = quantity;
		this.fat = fat;
		this.collectionDate = collectionDate;
		this.collectionTime = collectionTime;
	}
	
	public String getCollectionDate() {
		return collectionDate;
	}
	public void setCollectionDate(String collectionDate) {
		this.collectionDate = collectionDate;
	}
	public String getCollectionTime() {
		return collectionTime;
	}
	public void setCollectionTime(String collectionTime) {
		this.collectionTime = collectionTime;
	}
	public String getInvoiceId() {
		return invoiceId;
	}
	public void setInvoiceId(String invoiceId) {
		this.invoiceId = invoiceId;
	}
	public String getVdcsId() {
		return vdcsId;
	}
	public void setVdcsId(String vdcsId) {
		this.vdcsId = vdcsId;
	}
	public String getFarmerId() {
		return farmerId;
	}
	public void setFarmerId(String farmerId) {
		this.farmerId = farmerId;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public Integer getFat() {
		return fat;
	}
	public void setFat(Integer fat) {
		this.fat = fat;
	}
	
	
}
