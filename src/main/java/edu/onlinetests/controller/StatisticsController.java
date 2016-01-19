package edu.onlinetests.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.service.CategoryService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "statisticsController")
@SessionScoped
@Component
public class StatisticsController {

	@Autowired
	private CategoryService categoryService;
	private List<Category> categories;
	
	public String initiateStatistics() {
		categories = categoryService.getTestCategories();
		return Pages.STATISTICS_PAGE;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}
}
