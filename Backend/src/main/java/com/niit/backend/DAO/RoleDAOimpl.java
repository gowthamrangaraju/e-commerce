package com.niit.backend.DAO;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.backend.model.Role;


@Repository("RoleDAO")
public class RoleDAOimpl implements RoleDAO {

	@Autowired
    SessionFactory sessionFactory;
     
	
    public RoleDAOimpl(SessionFactory sessionFactory2) {
    	  this.sessionFactory=sessionFactory;
	}
    @Transactional
	public void insertRole(Role role) {
    	sessionFactory.getCurrentSession().saveOrUpdate(role);

	}
    @Transactional
	public void deleteRole(String roleId) {
		// TODO Auto-generated method stub

	}
    @Transactional
	public List<Role> retrieve() {
		// TODO Auto-generated method stub
		return null;
	}
    @Transactional
	public Role getByRoleId(String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

}