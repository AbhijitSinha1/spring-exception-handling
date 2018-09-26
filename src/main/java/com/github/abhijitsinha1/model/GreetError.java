package com.github.abhijitsinha1.model;

public class GreetError {

	private final String message;

	private GreetError(String message) {
		this.message = message;
	}

	public static GreetError of(String message) {
		return new GreetError(message);
	}

	public String getMessage() {
		return message;
	}

}
