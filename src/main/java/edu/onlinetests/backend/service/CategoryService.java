package edu.onlinetests.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import edu.onlinetests.model.Category;

@Service(value = "categoryService")
public interface CategoryService {

	List<Category> getCategories();
	
}
