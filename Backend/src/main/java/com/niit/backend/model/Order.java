package com.niit.backend.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Order")
@Component
public class Order {
	
	@Id
	@GeneratedValue(strategy =  GenerationType.IDENTITY)
	private String OrderId;
	
	
	public String getOrderId() {
		return OrderId;
	}
	public void setOrderId(String orderId) {
		OrderId = orderId;
	}
	
	
	private String PaymentMode;
	private String ShippingAddress;
	private String Status;
	private String CustomerName;
	
	public String getPaymentMode() {
		return PaymentMode;
	}
	public void setPaymentMode(String paymentMode) {
		PaymentMode = paymentMode;
	}
	public String getShippingAddress() {
		return ShippingAddress;
	}
	public void setShippingAddress(String shippingAddress) {
		ShippingAddress = shippingAddress;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	public String getCustomerName() {
		return CustomerName;
	}
	public void setCustomerName(String customerName) {
		CustomerName = customerName;
	}

	
	

}
