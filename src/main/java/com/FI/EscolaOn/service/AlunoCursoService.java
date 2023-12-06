package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.AlunoCursoRepository;
import com.FI.EscolaOn.Repositories.AlunoRepository;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.AlunoCurso;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlunoCursoService {
    @Autowired
    AlunoCursoRepository alunoCursoRepository;

    public void save(AlunoCurso alunoCurso) {
        alunoCursoRepository.save(alunoCurso);
    }
}
