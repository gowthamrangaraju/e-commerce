package com.niit.backend.DAO;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Category;

@Repository("CategoryDAO")
public class CategoryDAOimpl implements CategoryDAO {

	@Autowired
    SessionFactory sessionFactory;
     
    public CategoryDAOimpl(SessionFactory sessionFactory2) {
    	  this.sessionFactory=sessionFactory;
	}
	
	@Transactional
	public void insertCategory(Category category) {
		
		 org.hibernate.Session session=sessionFactory.getCurrentSession();
	        session.saveOrUpdate(category);
		
	}
	@Transactional
	public void deleteCategory(String categoryId) {
		org.hibernate.Session session=sessionFactory.getCurrentSession();
        Serializable catid = null;
		Category category=(Category)session.get(Category.class,catid);
        session.delete(category);
		
	}

	public List<Category> retrieve() {
		 org.hibernate.Session session=sessionFactory.openSession();
	        @SuppressWarnings("unchecked")
	        List<Category> List=session.createQuery("from Category").list();
	        session.close();
		return null;
	}

	public Category getBycategoryId(String categoryId) {
		// TODO Auto-generated method stub
		return null;
	}

}
