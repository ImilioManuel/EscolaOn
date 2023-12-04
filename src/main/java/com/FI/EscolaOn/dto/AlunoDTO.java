package com.FI.EscolaOn.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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

}
