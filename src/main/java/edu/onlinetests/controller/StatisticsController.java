package edu.onlinetests.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.onlinetests.model.Category;
import edu.onlinetests.model.Question;
import edu.onlinetests.service.CategoryService;
import edu.onlinetests.view.Pages;
import edu.onlinetests.view.dto.QuestionStatisticDTO;

@ManagedBean(name = "statisticsController")
@SessionScoped
@Component
public class StatisticsController {

	@Autowired
	private CategoryService categoryService;
	private List<Category> categories;
	private Map<Question, QuestionStatisticDTO> statisticByQuestion;
	
	public String initiateStatistics() {
		categories = categoryService.getCategories();
		statisticByQuestion = new HashMap<Question, QuestionStatisticDTO>();
		for (Category category : categories) {
			for (Question question : category.getQuestions()) {
				statisticByQuestion.put(question, new QuestionStatisticDTO(question));
			}
		}
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
	
	public Map<Question, QuestionStatisticDTO> getStatisticByQuestion() {
		return statisticByQuestion;
	}

	public void setStatisticByQuestion(
			Map<Question, QuestionStatisticDTO> statisticByQuestion) {
		this.statisticByQuestion = statisticByQuestion;
	}
}
