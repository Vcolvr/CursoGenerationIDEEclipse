package org.generation.blogpessoal.controller;

import java.util.List;

import javax.validation.Valid;


import org.generation.blogpessoal.model.Tema;
import org.generation.blogpessoal.repository.TemaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/tema")
@CrossOrigin("*")
public class TemaController {
	
	@Autowired
	private TemaRepository temaRepository;

	@GetMapping
	public ResponseEntity<List<Tema>> GetAll() {
		return ResponseEntity.ok(temaRepository.findAll());
	}

	@GetMapping("/{id}")
	public ResponseEntity<Tema> GetById(@PathVariable long id) {
		return temaRepository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}

	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Tema>> GetByTitulo(@PathVariable String descricao) {
		return ResponseEntity.ok(temaRepository.findAllByDescricaoContainingIgnoreCase(descricao));
	}
	
	//O valid permite que você valide as informações e retorne com mensagens para o usuário.
	@PostMapping
	public ResponseEntity<Tema> post(@Valid @RequestBody Tema tema) {
		return ResponseEntity.status(HttpStatus.CREATED).body(temaRepository.save(tema));
	}
}
