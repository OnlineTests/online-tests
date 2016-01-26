package edu.onlinetests.backend.exception;

import java.util.List;

public class ServerException extends RuntimeException {

	private static final long serialVersionUID = 2212431308245611187L;
	private List<String> errors;
	
	public ServerException(String message, List<String> errors) {
		super(message);
		this.errors = errors;
	}
	
	public List<String> getErrors() {
		return errors;
	}
}
