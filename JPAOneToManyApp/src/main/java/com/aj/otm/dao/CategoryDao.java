package com.aj.otm.dao;

import com.aj.otm.entities.CategoryEntity;

public interface CategoryDao {
	
	void saveCategory(CategoryEntity entity);
	
	CategoryEntity fetchCategory(Integer categoryId);
	
	void removeCategory(Integer categoryId);
	

}
