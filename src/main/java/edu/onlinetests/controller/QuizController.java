package edu.onlinetests.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import edu.onlinetests.model.Category;
import edu.onlinetests.service.CategoryService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "quizController")
@SessionScoped
public class QuizController {
	
	private List<Category> categories;
	private Category selectedCategory;
	
	@ManagedProperty(value = "#{categoryService}")
	private CategoryService categoryService;
	
	public String initiateQuiz() {
		Category category1 = new Category();
		category1.setName("sport");
		Category category2 = new Category();
		category2.setName("istorie");
		categories.add(category1);
		categories.add(category2);
		//categories = categoryService.getTestCategories();
		return Pages.QUIZ_PAGE;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public Category getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(Category selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}
	
	

}
