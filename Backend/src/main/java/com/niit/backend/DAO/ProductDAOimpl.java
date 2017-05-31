package com.niit.backend.DAO;

import java.io.Serializable;
import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Product;
import com.niit.backend.DAO.ProductDAO;

@Repository("ProductDAO")
public class ProductDAOimpl implements ProductDAO {

	@Autowired
    SessionFactory sessionFactory;
     
    public ProductDAOimpl(SessionFactory sessionFactory2) {
    	  this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertProduct(Product product) {
		
		 org.hibernate.Session session=sessionFactory.getCurrentSession();
	        session.saveOrUpdate(product);
		
	}
	@Transactional
	public void deleteProduct(String productId) {
		org.hibernate.Session session=sessionFactory.getCurrentSession();
        Serializable prdid = null;
		Product product=(Product)session.get(Product.class,prdid);
        session.delete(product);
		
	}

	public List<Product> retrieve() {
		 org.hibernate.Session session=sessionFactory.openSession();
	        @SuppressWarnings("unchecked")
	        List<Product> List=session.createQuery("from Category").list();
	        session.close();
		return null;
	}

	public Product getByProductId(String productId) {
		// TODO Auto-generated method stub
		return null;
	}

}
