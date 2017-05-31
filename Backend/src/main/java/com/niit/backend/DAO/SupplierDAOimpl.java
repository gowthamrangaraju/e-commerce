package com.niit.backend.DAO;

import java.io.Serializable;
import java.util.List;

import org.h2.engine.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Supplier;
import com.niit.backend.DAO.SupplierDAO;

@Repository("SupplierDAO")
public class SupplierDAOimpl implements SupplierDAO {

	@Autowired
    SessionFactory sessionFactory;
     
    public SupplierDAOimpl(SessionFactory sessionFactory2) {
    	  this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertSupplier(Supplier supplier) {
		
		 org.hibernate.Session session=sessionFactory.getCurrentSession();
	        session.saveOrUpdate(supplier);
		
	}
	@Transactional
	public void deleteSupplier1(String SupplierId) {
		org.hibernate.Session session=sessionFactory.getCurrentSession();
        Serializable supid = null;
		Supplier supplier=(Supplier)session.get(Supplier.class,supid);
        session.delete(supplier);
		
	}

	public List<Supplier> retrieve() {
		 org.hibernate.Session session=sessionFactory.openSession();
	        @SuppressWarnings("unchecked")
	        List<Supplier> List=session.createQuery("from Supplier").list();
	        session.close();
		return null;
	}


	public void deleteSupplier(String Supplier) {
		// TODO Auto-generated method stub
		
	}

	public Supplier getBySupplierId1(String SupplierId) {
		// TODO Auto-generated method stub
		return null;
	}

	public Supplier getBySupplierId(String SupplierId) {
		// TODO Auto-generated method stub
		return null;
	}

}
