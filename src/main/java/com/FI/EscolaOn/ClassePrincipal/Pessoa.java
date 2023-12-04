package com.FI.EscolaOn.ClassePrincipal;

import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.DataDeNascimento;
import com.FI.EscolaOn.entity.Endereco;
import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@Data
@EqualsAndHashCode(of = {"id"})
public abstract class Pessoa implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nomeCompleto;
    @OneToOne
    @JoinColumn(name = "dataNascimento_id")
    private DataDeNascimento dataDeNascimento;
    @ManyToOne
    @JoinColumn(name = "endereco_id")
    private Endereco endereco;
    @ManyToOne
    @JoinColumn(name = "contacto_id")
    private Contacto contacto;
    private char genero;
    private String senha;
    private LocalDateTime dataCadastro;

    public Pessoa() {
    }

    public Pessoa(String nomeCompleto, DataDeNascimento dataDeNascimento, Endereco endereco, Contacto contacto, char genero, String senha,LocalDateTime dataCadastro) {
        this.nomeCompleto = nomeCompleto;
        this.dataDeNascimento = dataDeNascimento;
        this.endereco = endereco;
        this.contacto = contacto;
        this.genero = genero;
        this.senha = senha;
        this.dataCadastro = dataCadastro;
    }
}
