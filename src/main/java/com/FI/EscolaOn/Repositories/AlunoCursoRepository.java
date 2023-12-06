package com.FI.EscolaOn.Repositories;

import com.FI.EscolaOn.Keys.AlunoCursoKey;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.AlunoCurso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlunoCursoRepository extends JpaRepository<AlunoCurso, AlunoCursoKey> {
}
