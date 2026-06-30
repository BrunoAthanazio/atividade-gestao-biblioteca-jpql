package com.weg.atividade_gestao_biblioteca_jpql.dto.editora;

public record EditoraRequestDto(
    String nome,
    String cnpj,
    Long telefone,
    String email
) {

}
