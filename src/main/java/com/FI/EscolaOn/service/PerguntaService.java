package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.*;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.DataDeNascimento;
import com.FI.EscolaOn.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PerguntaService {
    @Autowired
    PerguntaRepository perguntaRepository;
}
