package com.FI.EscolaOn.Keys;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Curso;
import jakarta.persistence.Embeddable;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Embeddable
public class AlunoCursoKey {
    @ManyToOne
    @JoinColumn(name = "aluno_id")
    private Aluno aluno;
    @ManyToOne
    @JoinColumn(name = "curso_id")
    private Curso curso;
}
