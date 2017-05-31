package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Cart;

public interface CartDAO {

	public void insertCart(Cart cart);
	
	public void deleteCart(String cartId);
	
	public List<Cart> retrieve();
	
	public Cart getBycartId(String cartId);
	
}

