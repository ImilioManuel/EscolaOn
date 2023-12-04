package com.FI.EscolaOn.service;

import com.FI.EscolaOn.Repositories.ContactoRepository;
import com.FI.EscolaOn.Repositories.EnderecoRepository;
import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactoService {
    @Autowired
    ContactoRepository contactoRepository;

    public Contacto save(Contacto contacto) {
        return contactoRepository.save(contacto);
    }
}
