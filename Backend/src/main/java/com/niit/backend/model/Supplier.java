package com.niit.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "supplier")
@Component
public class Supplier {

	@Id
	@GeneratedValue
	private String supplierrId;
	
	@Column
	private String supplierName;
	
	private String supplierphno;
	
	
	private String supplierAddress;


	public String getSupplierrId() {
		return supplierrId;
	}


	public void setSupplierrId(String supplierrId) {
		this.supplierrId = supplierrId;
	}


	public String getSupplierName() {
		return supplierName;
	}


	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}


	public String getSupplierphno() {
		return supplierphno;
	}


	public void setSupplierphno(String supplierphno) {
		this.supplierphno = supplierphno;
	}


	public String getSupplierAddress() {
		return supplierAddress;
	}


	public void setSupplierAddress(String supplierAddress) {
		this.supplierAddress = supplierAddress;
	}
	
	
	
}