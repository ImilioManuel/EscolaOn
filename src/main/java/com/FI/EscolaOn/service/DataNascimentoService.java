package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.ContactoRepository;
import com.FI.EscolaOn.Repositories.DataNascimentoRepository;
import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.DataDeNascimento;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DataNascimentoService {
    @Autowired
    DataNascimentoRepository dataNascimentoRepository;

    public DataDeNascimento save(DataDeNascimento dataDeNascimento) {
        return dataNascimentoRepository.save(dataDeNascimento);
    }
}
