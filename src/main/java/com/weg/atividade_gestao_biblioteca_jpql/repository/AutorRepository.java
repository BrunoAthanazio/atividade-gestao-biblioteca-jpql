package com.weg.atividade_gestao_biblioteca_jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.atividade_gestao_biblioteca_jpql.model.Autor;

@Repository
public interface AutorRepository extends JpaRepository<Autor, Long>{
    boolean existsByNome(String nome);
}
