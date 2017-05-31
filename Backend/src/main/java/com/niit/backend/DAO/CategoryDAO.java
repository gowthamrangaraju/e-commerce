package com.niit.backend.DAO;

import java.util.List;

import com.niit.backend.model.Category;

public interface CategoryDAO {

	public void insertCategory(Category category);
	
	public void deleteCategory(String categoryId);
	
	public List<Category> retrieve();
	
	public Category getBycategoryId(String categoryId);
	
}
