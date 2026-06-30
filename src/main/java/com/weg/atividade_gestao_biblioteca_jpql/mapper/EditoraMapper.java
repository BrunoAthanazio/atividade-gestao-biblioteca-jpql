package com.weg.atividade_gestao_biblioteca_jpql.mapper;

import org.springframework.stereotype.Component;

import com.weg.atividade_gestao_biblioteca_jpql.dto.editora.EditoraRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.editora.EditoraResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.model.Editora;

@Component
public class EditoraMapper {

    public Editora toEntity(EditoraRequestDto dto){
        return new Editora(
            dto.nome(),
            dto.cnpj(),
            dto.telefone(),
            dto.email());
    }

    public EditoraResponseDto toResponse(Editora editora){
        return new EditoraResponseDto(
            editora.getId(),
            editora.getNome(),
            editora.getCnpj(),
            editora.getTelefone(),
            editora.getEmail());
    }
}
