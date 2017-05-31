package com.niit.backend.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "customer")
@Component
public class Customer {

	@Id
	@GeneratedValue
	private String customerId;
	
	@Column
	private String customerName;
	
	private String customerphno;
	
	private String customerEmail;
	
	private String password;
	
	private String customeraddress;
	
	private String customershippingaddress;
	
	private String zipcode;
	
	private boolean enabled;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "customerId")
	private Role role;
	
	
	

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public String getCustomerEmail() {
		return customerEmail;
	}

	public void setCustomerEmail(String customerEmail) {
		this.customerEmail = customerEmail;
	}

	

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getZipcode() {
		return zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	public String getCustomerphno() {
		return customerphno;
	}

	public void setCustomerphno(String customerphno) {
		this.customerphno = customerphno;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomeraddress() {
		return customeraddress;
	}

	public void setCustomeraddress(String customeraddress) {
		this.customeraddress = customeraddress;
	}

	public String getCustomershippingaddress() {
		return customershippingaddress;
	}

	public void setCustomershippingaddress(String customershippingaddress) {
		this.customershippingaddress = customershippingaddress;
	}

	
	
	
}
