package com.edsontomas.blogDoEdson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsontomas.blogDoEdson.entity.Postagem;
import com.edsontomas.blogDoEdson.repository.PostagemRepository;

@RestController
@RequestMapping("/api/posts")
public class PostagemController {

	@Autowired
	private PostagemRepository postagemRepo;
	
	@GetMapping
	public List<Postagem> listarPostagem(){
		return postagemRepo.findAll();
	}
	
	@PostMapping
	public ResponseEntity<Postagem> criarPostagem(@RequestBody Postagem post){
	
		return ResponseEntity.ok(postagemRepo.save(post));
	}
	
}
