package com.niit.backend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "product")
@Component
public class Product {

	@Id
	@GeneratedValue
	private String productId;
	
	@Column
	private String productName;
	
	private String productsupplier;
	
	private String productprice;
	
	private String productdes;
	
	private String productstock;
	
	private String productreview;
	
	private String productoffers;
	
	

	public String getProductreview() {
		return productreview;
	}

	public void setProductreview(String productreview) {
		this.productreview = productreview;
	}

	public String getProductoffers() {
		return productoffers;
	}

	public void setProductoffers(String productoffers) {
		this.productoffers = productoffers;
	}

	public String getProductdes() {
		return productdes;
	}

	public void setProductdes(String productdes) {
		this.productdes = productdes;
	}

	public String getProductstock() {
		return productstock;
	}

	public void setProductstock(String productstock) {
		this.productstock = productstock;
	}

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductsupplier() {
		return productsupplier;
	}

	public void setProductsupplier(String productsupplier) {
		this.productsupplier = productsupplier;
	}

	public String getProductprice() {
		return productprice;
	}

	public void setProductprice(String productprice) {
		this.productprice = productprice;
	}
	
	

	

		
	
	
}
