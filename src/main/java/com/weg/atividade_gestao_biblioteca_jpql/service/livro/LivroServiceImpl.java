package com.weg.atividade_gestao_biblioteca_jpql.service.livro;

import org.springframework.stereotype.Service;

import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.mapper.LivroMapper;
import com.weg.atividade_gestao_biblioteca_jpql.model.Livro;
import com.weg.atividade_gestao_biblioteca_jpql.repository.EditoraRepository;
import com.weg.atividade_gestao_biblioteca_jpql.repository.LivroRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LivroServiceImpl implements LivroService{

    private final LivroMapper mapper;

    private final LivroRepository livroRepository;

    private final EditoraRepository editoraRepository;

    @Override
    public LivroResponseDto save(LivroRequestDto dto) {
        Livro livro = mapper.toEntity(dto);
        if(editoraRepository.existsByNome(livro.getEditora().getNome())){
            livro.setEditora(editoraRepository.findByNome(livro.getEditora().getNome()));
        }
        livroRepository.save(livro);
        return mapper.toResponse(livro);
    }

}
