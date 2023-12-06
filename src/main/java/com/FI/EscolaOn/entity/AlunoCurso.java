package com.FI.EscolaOn.entity;

import com.FI.EscolaOn.Keys.AlunoCursoKey;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;

@Entity
public class AlunoCurso {
    @EmbeddedId
    AlunoCursoKey id = new AlunoCursoKey();
    public AlunoCurso() {
    }
    public AlunoCurso(Curso curso, Aluno aluno) {
        this.id.setCurso(curso);
        this.id.setAluno(aluno);
    }
}
