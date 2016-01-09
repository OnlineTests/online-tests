package edu.onlinetests.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Question_Statistic database table.
 * 
 */
@Entity
@Table(name="Question_Statistic")
public class QuestionStatistic implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int statisticId;

	@Column(nullable=false)
	private int answerA;

	@Column(nullable=false)
	private int answerB;

	@Column(nullable=false)
	private int answerC;

	@Column(nullable=false)
	private int answerD;

	//bi-directional one-to-one association to Question
	@OneToOne(mappedBy="questionStatistic")
	private Question question;

	public QuestionStatistic() {
	}

	public int getStatisticId() {
		return this.statisticId;
	}

	public void setStatisticId(int statisticId) {
		this.statisticId = statisticId;
	}

	public int getAnswerA() {
		return this.answerA;
	}

	public void setAnswerA(int answerA) {
		this.answerA = answerA;
	}

	public int getAnswerB() {
		return this.answerB;
	}

	public void setAnswerB(int answerB) {
		this.answerB = answerB;
	}

	public int getAnswerC() {
		return this.answerC;
	}

	public void setAnswerC(int answerC) {
		this.answerC = answerC;
	}

	public int getAnswerD() {
		return this.answerD;
	}

	public void setAnswerD(int answerD) {
		this.answerD = answerD;
	}

	public Question getQuestion() {
		return this.question;
	}

	public void setQuestion(Question question) {
		this.question = question;
	}

}