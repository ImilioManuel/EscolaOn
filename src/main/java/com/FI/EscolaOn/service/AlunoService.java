package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.AlunoRepository;
import com.FI.EscolaOn.Repositories.ContactoRepository;
import com.FI.EscolaOn.Repositories.DataNascimentoRepository;
import com.FI.EscolaOn.Repositories.EnderecoRepository;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.DataDeNascimento;
import com.FI.EscolaOn.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AlunoService {
    @Autowired
    AlunoRepository alunoRepository;
    public Object save(Aluno aluno) {
        return alunoRepository.save(aluno);
    }
}
