package com.weg.atividade_gestao_biblioteca_jpql.controller;

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
    public LivroResponseDto postLivro(@RequestBody LivroRequestDto dto){
        try{
            return serviceImpl.save(dto);
        }catch(RuntimeException e){
            throw new RuntimeException(e.getMessage());
        }
    }
}
