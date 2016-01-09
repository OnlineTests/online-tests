package edu.onlinetests.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the Question database table.
 * 
 */
@Entity
@Table(name="Question")
@NamedQuery(name="Question.findAll", query="SELECT q FROM Question q")
public class Question implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int questionId;

	@Column(nullable=false, length=50)
	private String answerA;

	@Column(nullable=false, length=50)
	private String answerB;

	@Column(nullable=false, length=50)
	private String answerC;

	@Column(nullable=false, length=50)
	private String answerD;

	@Column(nullable=false, length=1)
	private String correctAnswer;

	@Column(nullable=false, length=50)
	private String question;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId", nullable=false)
	private Category category;

	//bi-directional one-to-one association to Question_Statistic
	@OneToOne
	@JoinColumn(name="questionId", referencedColumnName="questionId", nullable=false, insertable=false, updatable=false)
	private QuestionStatistic questionStatistic;

	public Question() {
	}

	public int getQuestionId() {
		return this.questionId;
	}

	public void setQuestionId(int questionId) {
		this.questionId = questionId;
	}

	public String getAnswerA() {
		return this.answerA;
	}

	public void setAnswerA(String answerA) {
		this.answerA = answerA;
	}

	public String getAnswerB() {
		return this.answerB;
	}

	public void setAnswerB(String answerB) {
		this.answerB = answerB;
	}

	public String getAnswerC() {
		return this.answerC;
	}

	public void setAnswerC(String answerC) {
		this.answerC = answerC;
	}

	public String getAnswerD() {
		return this.answerD;
	}

	public void setAnswerD(String answerD) {
		this.answerD = answerD;
	}

	public String getCorrectAnswer() {
		return this.correctAnswer;
	}

	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getQuestion() {
		return this.question;
	}

	public void setQuestion(String question) {
		this.question = question;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public QuestionStatistic getQuestionStatistic() {
		return this.questionStatistic;
	}

	public void setQuestionStatistic(QuestionStatistic questionStatistic) {
		this.questionStatistic = questionStatistic;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((question == null) ? 0 : question.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Question other = (Question) obj;
		if (question == null) {
			if (other.question != null)
				return false;
		} else if (!question.equals(other.question))
			return false;
		return true;
	}
	
	

}