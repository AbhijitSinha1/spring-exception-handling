package com.github.abhijitsinha1.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.github.abhijitsinha1.exception.GreetingException;
import com.github.abhijitsinha1.model.Greet;

@RestController
@RequestMapping("/greet")
public class GreetingController {
	@RequestMapping("/{name}")
	public Greet greet(@PathVariable(value = "name") String name) {
		if (name.equalsIgnoreCase("ira")) {
			throw new GreetingException("oops!!! something went wrong... could not greet you :P");
		}
		return Greet.of(name);
	}
}
