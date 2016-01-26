package edu.onlinetests.backend.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.persistance.CategoryDAO;
import edu.onlinetests.backend.service.CategoryService;
import edu.onlinetests.model.Category;

@Component
public class CategoryServiceImpl implements CategoryService{

	private CategoryDAO categoryDAO;
	
	@Autowired
	public CategoryServiceImpl(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

	@Override
	public List<Category> getCategories() {
		return categoryDAO.getCategories();
	}
}
