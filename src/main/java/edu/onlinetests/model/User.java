package edu.onlinetests.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the User database table.
 * 
 */
@Entity
@Table(name="User")
@NamedQuery(name="User.findAll", query="SELECT u FROM User u")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(unique=true, nullable=false)
	private int userId;

	@Column(nullable=false, length=50)
	private Integer age;

	@Column(nullable=false, length=50)
	private String email;

	@Column(nullable=false, length=1)
	private String gender;

	@Column(nullable=false, length=50)
	private String name;

	@Column(nullable=false, length=50)
	private String password;

	@Column(nullable=false, length=50)
	private String username;

	//bi-directional many-to-one association to Test_Result
	@OneToMany(fetch = FetchType.EAGER, mappedBy="user")
	private List<TestResult> testResults;

	public User() {
	}

	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public Integer getAge() {
		return this.age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public List<TestResult> getTestResults() {
		return this.testResults;
	}

	public void setTestResults(List<TestResult> testResults) {
		this.testResults = testResults;
	}

	public TestResult addTestResult(TestResult testResult) {
		getTestResults().add(testResult);
		testResult.setUser(this);

		return testResult;
	}

	public TestResult removeTestResult(TestResult testResult) {
		getTestResults().remove(testResult);
		testResult.setUser(null);

		return testResult;
	}

}