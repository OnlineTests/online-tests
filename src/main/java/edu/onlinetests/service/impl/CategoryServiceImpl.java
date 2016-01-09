package edu.onlinetests.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import edu.onlinetests.model.Category;
import edu.onlinetests.persistance.CategoryDAO;
import edu.onlinetests.service.CategoryService;

public class CategoryServiceImpl implements CategoryService{

	private CategoryDAO categoryDAO;
	
	@Autowired
	public CategoryServiceImpl(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	@Override
	public List<Category> getTestCategories() {
		return categoryDAO.getTestCategories();
	}
}
