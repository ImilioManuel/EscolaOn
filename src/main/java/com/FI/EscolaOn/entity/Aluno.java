package com.FI.EscolaOn.entity;

import com.FI.EscolaOn.ClassePrincipal.Pessoa;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Aluno extends Pessoa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private double nota;



    public Aluno() {
    }
    public Aluno(String nomeCompleto, DataDeNascimento dataDeNascimento, Endereco endereco, Contacto contacto, char genero, String senha, LocalDateTime dataCadastro) {
        super(nomeCompleto, dataDeNascimento, endereco, contacto, genero,senha,dataCadastro);
    }


}
