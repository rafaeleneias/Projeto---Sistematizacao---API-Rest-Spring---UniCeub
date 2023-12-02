package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Entregador;
import com.example.demo.repository.EntregadorRepository;

@RestController
@RequestMapping("/entregadores")
public class EntregadorController {
	
	@Autowired
	private EntregadorRepository entregadorRepository;

	@GetMapping
	public List<Entregador> listar(){
		return entregadorRepository.findAll();
	}
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Entregador cadastrarEntregador(@RequestBody Entregador entregador) {
	    System.out.println("Recebido: " + entregador.toString());
	    return entregadorRepository.save(entregador);
	}
}
