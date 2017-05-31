package com.niit.backend;

import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.CartDAO;
import com.niit.backend.DAO.OrderDAO;
import com.niit.backend.model.Cart;
import com.niit.backend.model.Order;

public class Carttest {
	public static void main(String arg[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		System.out.println("hello");

		CartDAO cartDAO = (CartDAO) context.getBean("CartDAO");

		Cart cart = (Cart) context.getBean("cart");

		cart.setCartitems("mobiles");
		cart.setQuantity("2");
		cart.setTotalamount("60000");
		cart.setShippingAddress("coimbatore,tamilnadu,India");

		cartDAO.insertCart(cart);

		
		

	}
}
