package com.weg.atividade_gestao_biblioteca_jpql.mapper;

import org.springframework.stereotype.Component;

import com.weg.atividade_gestao_biblioteca_jpql.dto.autor.AutorRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.autor.AutorResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.model.Autor;

@Component
public class AutorMapper {

    public Autor toEntity(AutorRequestDto dto){
        return new Autor(
            dto.nome(),
            dto.nacionalidade(),
            dto.dataNascimento());
    }

    public AutorResponseDto toResponse(Autor autor){
        return new AutorResponseDto(
            autor.getId(),
            autor.getNome(),
            autor.getNacionalidade(),
            autor.getDataNascimento());
    }
}
