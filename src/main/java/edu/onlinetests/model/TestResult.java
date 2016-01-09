package edu.onlinetests.model;

import java.io.Serializable;

import javax.persistence.*;


/**
 * The persistent class for the Test_Result database table.
 * 
 */
@Entity
@Table(name="Test_Result")
public class TestResult implements Serializable, Comparable<TestResult> {
	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private TestResultPK id;

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

	public TestResult() {
	}

	public TestResultPK getId() {
		return this.id;
	}

	public void setId(TestResultPK id) {
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + score;
		result = prime * result + ((user == null) ? 0 : user.hashCode());
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
		TestResult other = (TestResult) obj;
		if (score != other.score)
			return false;
		if (user == null) {
			if (other.user != null)
				return false;
		} else if (!user.equals(other.user))
			return false;
		return true;
	}

	@Override
	public int compareTo(TestResult o) {
		return Integer.compare(score, o.getScore());
	}
	
	

}