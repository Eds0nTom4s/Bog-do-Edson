package com.edsontomas.blogDoEdson.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edsontomas.blogDoEdson.entity.Comentario;
import com.edsontomas.blogDoEdson.repository.ComentarioRepository;

@RestController
@RequestMapping("/api/comentarios")
public class ComentarioController {

	@Autowired
	private ComentarioRepository comentarioRepo;
	
	@GetMapping
    public List<Comentario> listarComentarios() {
        return comentarioRepo.findAll();
    }

    @PostMapping
    public ResponseEntity<Comentario> criarComentario(@RequestBody Comentario comentario) {
        return ResponseEntity.ok(comentarioRepo.save(comentario));
    }
	
	
}
