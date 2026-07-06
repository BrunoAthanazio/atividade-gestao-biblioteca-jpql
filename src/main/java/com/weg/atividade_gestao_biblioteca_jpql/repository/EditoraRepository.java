package com.weg.atividade_gestao_biblioteca_jpql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.weg.atividade_gestao_biblioteca_jpql.model.Editora;

@Repository
public interface EditoraRepository extends JpaRepository<Editora, Long>{
    boolean existsByNome(String nome);
    Editora findByNome(String nome);
}
