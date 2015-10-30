package edu.onlinetests.model;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The primary key class for the Test_Result database table.
 * 
 */
@Embeddable
public class Test_ResultPK implements Serializable {
	//default serial version id, required for serializable classes.
	private static final long serialVersionUID = 1L;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int userId;

	@Column(insertable=false, updatable=false, unique=true, nullable=false)
	private int categoryId;

	public Test_ResultPK() {
	}
	public int getUserId() {
		return this.userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getCategoryId() {
		return this.categoryId;
	}
	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public boolean equals(Object other) {
		if (this == other) {
			return true;
		}
		if (!(other instanceof Test_ResultPK)) {
			return false;
		}
		Test_ResultPK castOther = (Test_ResultPK)other;
		return 
			(this.userId == castOther.userId)
			&& (this.categoryId == castOther.categoryId);
	}

	public int hashCode() {
		final int prime = 31;
		int hash = 17;
		hash = hash * prime + this.userId;
		hash = hash * prime + this.categoryId;
		
		return hash;
	}
}