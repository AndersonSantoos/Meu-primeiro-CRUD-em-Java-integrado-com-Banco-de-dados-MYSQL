package com.lojaapp.lojaapp.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@GetMapping(path= {"/ola", "lojao", "l"})
	public String ola() {
		return "Deu certo!";
	}

}
