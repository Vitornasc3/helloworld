package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {
	
	@GetMapping
	public String hello() {
		return "<h2><b>Hello turma 68!</b></h2>";
	}
	
	
	@GetMapping("/top")
	public String top() {
		return "<h1><b>Turma 68 é topppp!</b></h1>";
	}

}
