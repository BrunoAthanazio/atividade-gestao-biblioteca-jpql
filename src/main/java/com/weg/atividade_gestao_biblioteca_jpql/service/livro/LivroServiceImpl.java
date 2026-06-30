package com.weg.atividade_gestao_biblioteca_jpql.service.livro;

import org.springframework.stereotype.Service;

import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.mapper.LivroMapper;
import com.weg.atividade_gestao_biblioteca_jpql.model.Livro;
import com.weg.atividade_gestao_biblioteca_jpql.repository.LivroRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LivroServiceImpl implements LivroService{

    private final LivroMapper mapper;

    private final LivroRepository repository;

    @Override
    public LivroResponseDto save(LivroRequestDto dto) {
        Livro livro = mapper.toEntity(dto);
        repository.save(livro);
        return mapper.toResponse(livro);
    }

}
