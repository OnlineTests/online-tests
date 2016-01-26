package edu.onlinetests.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.primefaces.event.TabChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.service.CategoryService;
import edu.onlinetests.service.TestService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "categoryResultsController")
@SessionScoped
@Component
public class CategoryResultsController {

	private List<Category> categories;
	private List<TestResult> result;
	private int index = 0;

	@Autowired
	private TestService testService;

	@Autowired
	private CategoryService categoryService;

	public String populateCategories() {
		result = testService.getBestResultsOfCategory(categories.get(0));
		categories = categoryService.getCategories();
		return Pages.CATEGORY_RESULTS_PAGE;
	}
	
    public void onTabChanged(TabChangeEvent e){
		result = testService.getBestResultsOfCategory(categories.get(index));
    }

	public String back() {
		return Pages.MAIN_PAGE;
	}
	
    public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public List<TestResult> getResult() {
		return result;
	}

	public void setResult(List<TestResult> result) {
		this.result = result;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

}
