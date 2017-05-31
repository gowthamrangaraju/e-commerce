package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Customer;

public interface CustomerDAO {

	public void insertCustomer(Customer customer);
	
	public void deleteCustomer(String customerId);
	
	public List<Customer> retrieve();
	
	public Customer getByCustomerId(String customerId);
	
}


