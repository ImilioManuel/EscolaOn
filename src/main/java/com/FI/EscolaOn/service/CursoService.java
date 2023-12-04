package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.*;
import com.FI.EscolaOn.entity.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class CursoService {
    @Autowired
    CursoRepository cursoRepository;

    public List<Curso> findAll() {
        return cursoRepository.findAll();
    }

    public Object save(Curso curso) {
        return cursoRepository.save(curso);
    }

    public Optional<Curso> findById(Integer id) {
        return cursoRepository.findById(id);
    }

    public void delete(Curso curso) {
        cursoRepository.delete(curso);
    }
}
