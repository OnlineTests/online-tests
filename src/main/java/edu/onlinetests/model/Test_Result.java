package edu.onlinetests.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Test_Result database table.
 * 
 */
@Entity
@Table(name="Test_Result")
@NamedQuery(name="Test_Result.findAll", query="SELECT t FROM Test_Result t")
public class Test_Result implements Serializable {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private Test_ResultPK id;

	@Column(nullable=false)
	private int score;

	//bi-directional many-to-one association to Category
	@ManyToOne
	@JoinColumn(name="categoryId", nullable=false, insertable=false, updatable=false)
	private Category category;

	//bi-directional many-to-one association to User
	@ManyToOne
	@JoinColumn(name="userId", nullable=false, insertable=false, updatable=false)
	private User user;

	public Test_Result() {
	}

	public Test_ResultPK getId() {
		return this.id;
	}

	public void setId(Test_ResultPK id) {
		this.id = id;
	}

	public int getScore() {
		return this.score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

}