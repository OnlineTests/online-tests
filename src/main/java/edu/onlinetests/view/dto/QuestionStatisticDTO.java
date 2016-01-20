package edu.onlinetests.view.dto;

import edu.onlinetests.model.Question;
import edu.onlinetests.model.QuestionStatistic;

public class QuestionStatisticDTO {

	private String answerAPercentage;
	private String answerBPercentage;
	private String answerCPercentage;
	private String answerDPercentage;
	private String correctAnswerPercentage;
	private String correctAnswer;
	private int answersNumber;
	
	public QuestionStatisticDTO(Question question) {
		QuestionStatistic statistic = question.getQuestionStatistic();
		if(statistic != null) {
			answersNumber = statistic.getAnswerNumber();
			answerAPercentage = getPercentage(statistic.getAnswerA(), answersNumber);
			answerBPercentage = getPercentage(statistic.getAnswerB(), answersNumber);
			answerCPercentage = getPercentage(statistic.getAnswerC(), answersNumber);
			answerDPercentage = getPercentage(statistic.getAnswerD(), answersNumber);
		} else {
			answerAPercentage = answerBPercentage = answerCPercentage = answerDPercentage = "-";
			answersNumber = 0;
		}
		switch (question.getCorrectAnswer()) {
		case "A":
			correctAnswerPercentage = answerAPercentage;
			this.correctAnswer = question.getAnswerA();
			break;
		case "B":
			correctAnswerPercentage = answerBPercentage;
			this.correctAnswer = question.getAnswerB();
			break;
		case "C":
			correctAnswerPercentage = answerCPercentage;
			this.correctAnswer = question.getAnswerC();
			break;
		case "D":
			correctAnswerPercentage = answerDPercentage;
			this.correctAnswer = question.getAnswerD();
		}
	}
	

	private String getPercentage(int dividend, int divizor) {
		double rawPercentage = 100.0 * (float) dividend / (float) divizor;
		return String.format("%2.2f", rawPercentage);
	}
	
	public String getCorrectAnswer() {
		return correctAnswer;
	}
	
	public void setCorrectAnswer(String correctAnswer) {
		this.correctAnswer = correctAnswer;
	}

	public String getAnswerAPercentage() {
		return answerAPercentage;
	}

	public void setAnswerAPercentage(String answerAPercentage) {
		this.answerAPercentage = answerAPercentage;
	}

	public String getAnswerBPercentage() {
		return answerBPercentage;
	}

	public void setAnswerBPercentage(String answerBPercentage) {
		this.answerBPercentage = answerBPercentage;
	}

	public String getAnswerCPercentage() {
		return answerCPercentage;
	}

	public void setAnswerCPercentage(String answerCPercentage) {
		this.answerCPercentage = answerCPercentage;
	}

	public String getAnswerDPercentage() {
		return answerDPercentage;
	}

	public void setAnswerDPercentage(String answerDPercentage) {
		this.answerDPercentage = answerDPercentage;
	}

	public String getCorrectAnswerPercentage() {
		return correctAnswerPercentage;
	}

	public void setCorrectAnswerPercentage(String correctAnswerPercentage) {
		this.correctAnswerPercentage = correctAnswerPercentage;
	}

	public int getAnswersNumber() {
		return answersNumber;
	}

	public void setAnswersNumber(int answersNumber) {
		this.answersNumber = answersNumber;
	}
}
