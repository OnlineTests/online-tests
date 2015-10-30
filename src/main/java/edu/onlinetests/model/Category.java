package edu.onlinetests.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the Category database table.
 * 
 */
@Entity
@Table(name="Category")
@NamedQuery(name="Category.findAll", query="SELECT c FROM Category c")
public class Category implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int CId;

	@Column(nullable=false, length=50)
	private String name;

	//bi-directional many-to-one association to Question
	@OneToMany(mappedBy="category")
	private List<Question> questions;

	//bi-directional many-to-one association to Test_Result
	@OneToMany(mappedBy="category")
	private List<Test_Result> testResults;

	public Category() {
	}

	public int getCId() {
		return this.CId;
	}

	public void setCId(int CId) {
		this.CId = CId;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Question> getQuestions() {
		return this.questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}

	public Question addQuestion(Question question) {
		getQuestions().add(question);
		question.setCategory(this);

		return question;
	}

	public Question removeQuestion(Question question) {
		getQuestions().remove(question);
		question.setCategory(null);

		return question;
	}

	public List<Test_Result> getTestResults() {
		return this.testResults;
	}

	public void setTestResults(List<Test_Result> testResults) {
		this.testResults = testResults;
	}

	public Test_Result addTestResult(Test_Result testResult) {
		getTestResults().add(testResult);
		testResult.setCategory(this);

		return testResult;
	}

	public Test_Result removeTestResult(Test_Result testResult) {
		getTestResults().remove(testResult);
		testResult.setCategory(null);

		return testResult;
	}

}