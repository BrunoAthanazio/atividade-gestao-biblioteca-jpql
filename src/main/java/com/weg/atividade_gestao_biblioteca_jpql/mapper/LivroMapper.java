package com.weg.atividade_gestao_biblioteca_jpql.mapper;

import org.springframework.stereotype.Component;

import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.model.Livro;

import lombok.RequiredArgsConstructor;

@Component
@RequiredArgsConstructor
public class LivroMapper {

    private final EditoraMapper editoraMapper;

    public Livro toEntity(LivroRequestDto dto){
        return new Livro(
            dto.titulo(),
            dto.isbn(),
            dto.preco(),
            dto.dataPublicacao(),
            dto.categoria(), 
            editoraMapper.toEntity(dto.editoraRequestDto()));
    }

    public LivroResponseDto toResponse(Livro livro){
        return new LivroResponseDto(
            livro.getId(),
            livro.getTitulo(),
            livro.getIsbn(),
            livro.getPreco(),
            livro.getDataPublicacao(),
            livro.getCategoria(),
            editoraMapper.toResponse(livro.getEditora()));
    }
}
