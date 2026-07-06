package com.weg.atividade_gestao_biblioteca_jpql.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.service.livro.LivroServiceImpl;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/livros")
@RequiredArgsConstructor
public class LivroController {

    private final LivroServiceImpl serviceImpl;

    @PostMapping
    public ResponseEntity<LivroResponseDto> postLivro(@RequestBody LivroRequestDto dto){

        return ResponseEntity.status(HttpStatus.CREATED).body(serviceImpl.save(dto));
    }
}
