package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Order;

public interface OrderDAO {

	public void insertOrder(Order order);
	
	public void deleteOrder(Order OrderId);
	
	public List<Order> retrieve();
	
	public Order getByOrderId(String OrderId);
	
}



