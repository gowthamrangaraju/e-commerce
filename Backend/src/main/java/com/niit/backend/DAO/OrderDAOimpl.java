package com.niit.backend.DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Order;

@Repository("OrderDAO")
public class OrderDAOimpl implements OrderDAO {

	@Autowired
    SessionFactory sessionFactory;
     
    public OrderDAOimpl(SessionFactory sessionFactory) {
    	  this.sessionFactory=sessionFactory;
	}
	
	
	@Transactional
	public void deleteOrder(Order OrderId) {
		org.hibernate.Session session=sessionFactory.getCurrentSession();
        Serializable supid = null;
		Order order=(Order)session.get(Order.class,supid);
        session.delete(order);
		
	}

	@Transactional
	public List<Order> retrieve() {
		 org.hibernate.Session session=sessionFactory.openSession();
	        @SuppressWarnings("unchecked")
	        List<Order> List=session.createQuery("from Order").list();
	        session.close();
		return null;
	}


	

	@Transactional
	public Order getByOrderId(String OrderId) {
		// TODO Auto-generated method stub
		return null;
	}


	@Transactional
	public void insertOrder(Order order) {
		// TODO Auto-generated method stub
		sessionFactory.getCurrentSession().save(order);
	}


	


	
}
