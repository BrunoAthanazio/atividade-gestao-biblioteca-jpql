package com.weg.atividade_gestao_biblioteca_jpql.dto.livro;

import java.math.BigDecimal;
import java.time.LocalDate;

import com.weg.atividade_gestao_biblioteca_jpql.dto.editora.EditoraResponseDto;

public record LivroResponseDto(
    Long id,
    String titulo,
    String isbn,
    BigDecimal preco,
    LocalDate dataPublicacao,
    String categoria,
    EditoraResponseDto editoraResponseDto
) {
    
}
