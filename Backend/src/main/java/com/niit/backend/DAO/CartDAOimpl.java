package com.niit.backend.DAO;

import java.io.Serializable;
import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Cart;
import com.niit.backend.DAO.CartDAO;

@Repository("CartDAO")
public class CartDAOimpl implements CartDAO {

	@Autowired
    SessionFactory sessionFactory;
     
    public CartDAOimpl(SessionFactory sessionFactory2) {
    	  this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertCart(Cart cart) {
		
		 org.hibernate.Session session=sessionFactory.getCurrentSession();
	        session.saveOrUpdate(cart);
		
	}
	@Transactional
	public void deleteCart1(String cartId) {
		org.hibernate.Session session=sessionFactory.getCurrentSession();
        Serializable cartid = null;
		Cart cart=(Cart)session.get(Cart.class,cartid);
        session.delete(cart);
		
	}

	public List<Cart> retrieve() {
		 org.hibernate.Session session=sessionFactory.openSession();
	        @SuppressWarnings("unchecked")
	        List<Cart> List=session.createQuery("from Cart").list();
	        session.close();
		return null;
	}

	public void deleteCart(String cartId) {
		// TODO Auto-generated method stub
		
	}

	public Cart getBycartId(String cartId) {
		// TODO Auto-generated method stub
		return null;    
	}


}
