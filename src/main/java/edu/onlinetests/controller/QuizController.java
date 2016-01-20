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
import edu.onlinetests.model.TestResult;
import edu.onlinetests.service.CategoryService;
import edu.onlinetests.service.QuestionService;
import edu.onlinetests.service.TestService;
import edu.onlinetests.view.Pages;

@ManagedBean(name = "quizController")
@SessionScoped
@Component
public class QuizController {
	
	private static final String DEFAULT_ANSWER = "default";
	
	private List<Category> categories;
	private String selectedCategory;
	private List<Question> questions;
	private Question currentQuestion;
	private String answer;
	private TestResult testResult;
	private String score;
	private int correctAnswersNumber;
	private int questionsNumber;
	
	private int questionIndex;
	private Map<String, Category> categoriesByName;
	private Map<Question, String> answersForQuestions;
	
	@Autowired
	private CategoryService categoryService;
	@Autowired
	private QuestionService questionService;
	@Autowired
	private TestService testService;
	
	public String initiateQuiz() {
		categories = categoryService.getCategories();
		categoriesByName = new HashMap<String, Category>();
		for (Category category : categories) {
			categoriesByName.put(category.getName(), category);
		}
		selectedCategory = categories.get(0).getName();
		answersForQuestions = new HashMap<Question, String>();
		return Pages.QUIZ_PAGE;
	}
	
	public String startQuiz() {
		Category category = categoriesByName.get(selectedCategory);
		questions = category.getQuestions();
		questionsNumber = questions.size();
		questionIndex = 0;
		currentQuestion = questions.get(questionIndex);
		answer = DEFAULT_ANSWER;
		return null;
	}
	
	public String nextQuestion() {
		answersForQuestions.put(currentQuestion, answer);
		++questionIndex;
		if(questionIndex < questions.size()) {
			answer = DEFAULT_ANSWER;
			currentQuestion = questions.get(questionIndex);
			return null;
		} else {
			prepareScoreForDisplay();
			return Pages.FINISHED_PAGE;
		}
	}

	private void prepareScoreForDisplay() {
		correctAnswersNumber = testService.evaluateTest(answersForQuestions, categoriesByName.get(selectedCategory));
		score = String.format("%2.2f", 100.0*(float)correctAnswersNumber / (float)questionsNumber);
	}
	
	public String back() {
		return Pages.MAIN_PAGE;
	}

	public String getAnswer() {
		return answer;
	}

	public void setAnswer(String answer) {
		this.answer = answer;
	}

	public Question getCurrentQuestion() {
		return currentQuestion;
	}

	public void setCurrentQuestion(Question currentQuestion) {
		this.currentQuestion = currentQuestion;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public QuestionService getQuestionService() {
		return questionService;
	}

	public void setQuestionService(QuestionService questionService) {
		this.questionService = questionService;
	}

	public List<Category> getCategories() {
		return categories;
	}

	public void setCategories(List<Category> categories) {
		this.categories = categories;
	}

	public String getSelectedCategory() {
		return selectedCategory;
	}

	public void setSelectedCategory(String selectedCategory) {
		this.selectedCategory = selectedCategory;
	}

	public CategoryService getCategoryService() {
		return categoryService;
	}

	public void setCategoryService(CategoryService categoryService) {
		this.categoryService = categoryService;
	}

	public TestResult getTestResult() {
		return testResult;
	}

	public void setTestResult(TestResult testResult) {
		this.testResult = testResult;
	}

	public int getQuestionsNumber() {
		return questionsNumber;
	}

	public void setQuestionsNumber(int questionsNumber) {
		this.questionsNumber = questionsNumber;
	}

	public TestService getTestService() {
		return testService;
	}

	public void setTestService(TestService testService) {
		this.testService = testService;
	}

	public String getScore() {
		return score;
	}

	public void setScore(String score) {
		this.score = score;
	}

	public int getCorrectAnswersNumber() {
		return correctAnswersNumber;
	}

	public void setCorrectAnswersNumber(int correctAnswersNumber) {
		this.correctAnswersNumber = correctAnswersNumber;
	}
}
