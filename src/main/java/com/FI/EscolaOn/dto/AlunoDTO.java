package com.FI.EscolaOn.dto;

import lombok.Data;


@Data
public class AlunoDTO {
    private String nomeCompleto;
    private char genero;
    private int dia;
    private int mes;
    private int ano;
    private String bairro;
    private String municipio;
    private String provincia;
    private String telefone;
    private String fixo;
    private String email;
    private String senha;
    private Integer cursoId;
}
