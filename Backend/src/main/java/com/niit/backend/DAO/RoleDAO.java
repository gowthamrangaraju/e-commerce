package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Role;

public interface RoleDAO {

public void insertRole(Role role);
	
	public void deleteRole(String roleId);
	
	public List<Role> retrieve();
	
	public Role getByRoleId(String roleId);
}