package br.abmael.sistema.dao;

import br.abmael.sistema.domain.Curso;

import java.util.List;

public interface CursoDao {
    void save(Curso curso);
    void update (Curso cuurso);
    void delete (Long id);
    Curso findById(Long id);
    List<Curso> findAll();
}
