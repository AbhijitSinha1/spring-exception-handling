package com.github.abhijitsinha1.model;

public class Greet {

	private String greeting;
	private String name;

	private Greet(String name) {
		this("Hello", name);
	}

	public Greet(String greeting, String name) {
		this.greeting = greeting;
		this.name = name;
	}

	public String getGreeting() {
		return greeting;
	}

	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static Greet of(String name) {
		return new Greet(name);
	}

}
