package com.vietanh.springboot.admin.dao;

import java.util.List;

import com.vietanh.springboot.admin.entity.Category;

public interface CategoryDao {
	void addCategory(Category category);

	void updateCategory(Category category);

	void deleteCategory(Category category);

	Category getCategoryByID(Long id);

	List<Category> getAllCategory();
}
