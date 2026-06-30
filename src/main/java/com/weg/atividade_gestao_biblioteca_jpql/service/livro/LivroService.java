package com.weg.atividade_gestao_biblioteca_jpql.service.livro;

import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroRequestDto;
import com.weg.atividade_gestao_biblioteca_jpql.dto.livro.LivroResponseDto;

public interface LivroService {

    LivroResponseDto save(LivroRequestDto dto);

}
