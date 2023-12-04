package com.FI.EscolaOn.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serial;
import java.io.Serializable;

@Entity
@Data
@EqualsAndHashCode(of = {"id"})
public class Endereco implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String bairro;
    private String municipio;
    private String provincia;

    public Endereco(String bairro, String municipio, String provincia) {
        this.bairro = bairro;
        this.municipio = municipio;
        this.provincia = provincia;
    }
}
