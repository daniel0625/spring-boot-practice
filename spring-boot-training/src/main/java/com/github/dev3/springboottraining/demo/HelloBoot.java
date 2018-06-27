package com.github.dev3.springboottraining.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloBoot {

	@RequestMapping("hello")
	public String hello() {
		return "Hello Spring boot";
	}
}
