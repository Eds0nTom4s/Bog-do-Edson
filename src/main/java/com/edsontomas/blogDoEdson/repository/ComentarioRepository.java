package com.edsontomas.blogDoEdson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsontomas.blogDoEdson.entity.Comentario;

public interface ComentarioRepository extends JpaRepository<Comentario, Long>{

}
