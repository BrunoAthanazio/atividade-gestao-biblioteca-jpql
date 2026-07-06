package com.weg.atividade_gestao_biblioteca_jpql.mapper;

import org.springframework.stereotype.Component;

import com.weg.atividade_gestao_biblioteca_jpql.dto.editora.EditoraRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.editora.EditoraResponseDto;
import com.weg.atividade_gestao_biblioteca_jpql.model.Editora;

@Component
public class EditoraMapper {

    public Editora toEntity(EditoraRequestDto editoraRequestDto){
        return new Editora(
            editoraRequestDto.nome(),
            editoraRequestDto.cnpj(),
            editoraRequestDto.telefone(),
            editoraRequestDto.email());
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
