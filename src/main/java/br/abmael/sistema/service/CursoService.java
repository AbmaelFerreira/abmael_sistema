package br.abmael.sistema.service;

import br.abmael.sistema.domain.Curso;

import java.util.Date;
import java.util.List;

public interface CursoService {

    void save (Curso curso);

    void update(Long id, Curso curso);

    void delete (long id);

    Curso findById(Long id);

    List<Curso> findAll();

    Curso updateDataInicio(Long id, Date dataInicio);


}
