package com.niit.backend.DAO;

import java.io.Serializable;
import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Customer;
import com.niit.backend.DAO.CustomerDAO;

@Repository("CustomerDAO")
public class CustomerDAOimpl implements CustomerDAO {

	@Autowired
    SessionFactory sessionFactory;
     
    public CustomerDAOimpl(SessionFactory sessionFactory2) {
    	  this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertCustomer(Customer customer) {
		
		 org.hibernate.Session session=sessionFactory.getCurrentSession();
	        session.saveOrUpdate(customer);
		
	}
	@Transactional
	public void deleteProduct(String customerId) {
		org.hibernate.Session session=sessionFactory.getCurrentSession();
        Serializable custid = null;
		Customer customer=(Customer)session.get(Customer.class,custid);
        session.delete(customer);
		
	}

	public List<Customer> retrieve() {
		 org.hibernate.Session session=sessionFactory.openSession();
	        @SuppressWarnings("unchecked")
	        List<Customer> List=session.createQuery("from Customer").list();
	        session.close();
		return null;
	}

	public Customer getByCustomerId(String CustomerId) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deleteCustomer(String CustomerId) {
		// TODO Auto-generated method stub
		
	}

}
