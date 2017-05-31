package com.niit.backend;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.backend.DAO.OrderDAO;
import com.niit.backend.model.Order;

public class Ordertest {
	public static void main(String arg[]) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
		context.scan("com.niit.backend");
		context.refresh();
		System.out.println("hello");

		OrderDAO orderDAO = (OrderDAO) context.getBean("OrderDAO");
		
		Order order = (Order) context.getBean("order");
		//order.setOrderId("12");
		order.setCustomerName("hi");
		order.setPaymentMode("online");
		order.setShippingAddress("cbe");
		order.setStatus("N");

		orderDAO.insertOrder(order);

	}
}
