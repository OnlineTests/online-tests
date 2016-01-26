package edu.onlinetests.frontend.controller;

import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

import org.primefaces.event.TabChangeEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.backend.service.CategoryService;
import edu.onlinetests.backend.service.TestService;
import edu.onlinetests.frontend.Pages;
import edu.onlinetests.model.Category;
import edu.onlinetests.model.TestResult;
import edu.onlinetests.model.User;

@ManagedBean(name = "categoryResultsController")
@SessionScoped
@Component
public class CategoryResultsController {

	private List<TestResult> result;
	private List<Category> categories;
	private int index = 0;
	
	@Autowired
	private TestService testService;

	@Autowired
	private CategoryService categoryService;

	public String populateCategories() {
		categories = categoryService.getCategories();
		setResult(testService.getBestResultsOfCategory(categories.get(0)));
		return Pages.CATEGORY_RESULTS_PAGE;
	}

	public String populateResults() {
		Map<String, Object> session = FacesContext.getCurrentInstance().getExternalContext().getSessionMap();
		User user = (User) session.get("user");
		setResult(testService.getOwnResults(user));
		return Pages.OWN_RESULTS_PAGE;
	}

	public void onTabChanged(TabChangeEvent e){
		setResult(testService.getBestResultsOfCategory(categories.get(index)));
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

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public List<TestResult> getResult() {
		return result;
	}

	public void setResult(List<TestResult> result) {
		this.result = result;
	}
}
