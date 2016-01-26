package edu.onlinetests.backend.validator;

import java.util.ArrayList;
import java.util.List;

import edu.onlinetests.model.User;

public class UserValidator {

	
	public static List<String> validate(User user) {
		List<String> errors = new ArrayList<String>();
		if(!isAgeValid(user.getAge())) {
			errors.add("Age is not valid, it must be between 18 and 100!");
		}
		if(!isPasswordValid(user.getPassword())) {
			errors.add("Password is invalid, it must contain at least 5 characters!");
		}
		if(!isEmailValid(user.getEmail())) {
			errors.add("Email is invalid!");
		}
		if(!isGenderValid(user.getGender())) {
			errors.add("Gender must be M(masculine) or F(feminine)!");
		}
		if(user.getName().isEmpty()) {
			errors.add("Name must not be empty!");
		}
		if(user.getUsername().isEmpty()) {
			errors.add("Username cannot be empty!");
		}
		return errors;
	}
	
	private static boolean isAgeValid(int age) {
		return age >= 18 && age <= 100;
	}
	
	private static boolean isPasswordValid(String password) {
		return password.length() >= 5;
	}
	
	private static boolean isEmailValid(String email) {
		return email.matches("[a-z][a-z0-9]*@[a-z]+\\.[a-z]+");
	}
	
	private static boolean isGenderValid(String gender) {
		return gender.equals("M") || gender.equals("F");
	}
	
}
