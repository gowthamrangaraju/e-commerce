package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Product;

public interface ProductDAO {

	public void insertProduct(Product product);
	
	public void deleteProduct(String ProductId);
	
	public List<Product> retrieve();
	
	public Product getByProductId(String ProductId);
	
}

