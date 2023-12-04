package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.*;
import com.FI.EscolaOn.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public Object save(Curso curso) {
        return cursoRepository.save(curso);
    }
}
