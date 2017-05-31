package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Supplier;

public interface SupplierDAO {

	public void insertSupplier(Supplier supplier);
	
	public void deleteSupplier(String SupplierId);
	
	public List<Supplier> retrieve();
	
	public Supplier getBySupplierId(String SupplierId);
	
}

