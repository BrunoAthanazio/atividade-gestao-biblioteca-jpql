package com.weg.atividade_gestao_biblioteca_jpql.dto.livro;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.weg.atividade_gestao_biblioteca_jpql.dto.editora.EditoraRequestDto;

public record LivroRequestDto(
    String titulo,
    String isbn,
    BigDecimal preco,
    LocalDate dataPublicacao,
    String categoria,
    EditoraRequestDto editoraRequestDto
) {

}
