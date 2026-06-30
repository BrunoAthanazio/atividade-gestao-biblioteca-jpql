package com.weg.atividade_gestao_biblioteca_jpql.dto.autor;

import java.time.LocalDate;

public record AutorRequestDto(
    String nome,
    String nacionalidade,
    LocalDate dataNascimento
) {

}
