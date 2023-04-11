package com.lojaapp.lojaapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lojaapp.lojaapp.model.entities.Carros;
import com.lojaapp.lojaapp.model.repository.CarrosRepository;

@RestController
@RequestMapping("/api/carros")
public class CarrosController {
	
	@Autowired
	public CarrosRepository carrosRepository;

	@PostMapping
	public @ResponseBody Carros salvarCarros(Carros carros) {
		carrosRepository.save(carros);
		return carros;
	}
	
	@PutMapping
	public Carros alterarCarros(@Valid Carros carros) {
		carrosRepository.save(carros);
		return carros;
	}
	
	//@GetMapping(path= "/{id}")
	//public Optional<Carros> obterCarrosPorId(@PathVariable int id) {
	//	return carrosRepository.findById(id);
	//}
	
	//Consultar todos dados cadastrados de uma vez
	@GetMapping
	public Iterable<Carros> obterCarros() {
		return carrosRepository.findAll();
	}
	
	@DeleteMapping(path= "/{id}")
	public void excluirCarros(@PathVariable int id) {
		carrosRepository.deleteById(id);
	}
	
}
