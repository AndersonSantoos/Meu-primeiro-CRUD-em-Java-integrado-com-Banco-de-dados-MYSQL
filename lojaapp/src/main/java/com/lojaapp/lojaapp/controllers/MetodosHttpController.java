package com.lojaapp.lojaapp.controllers;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class MetodosHttpController {
	
	@GetMapping
	public String get() {
		return "REQUISIÇÃO GET";
	}
	
	@PostMapping
	public String post() {
		return "REQUISIÇÃO POST";
	}
	
	@PutMapping
	public String put() {
		return "REQUISIÇÃO PUT";
	}
	
	@DeleteMapping
	public String delete() {
		return "REQUISIÇÃO DELETE";
	}

}
