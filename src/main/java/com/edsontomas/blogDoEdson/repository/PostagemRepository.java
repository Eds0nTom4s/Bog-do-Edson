package com.edsontomas.blogDoEdson.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edsontomas.blogDoEdson.entity.Postagem;

public interface PostagemRepository extends JpaRepository<Postagem, Long> {

}
