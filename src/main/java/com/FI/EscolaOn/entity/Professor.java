package com.FI.EscolaOn.entity;

import com.FI.EscolaOn.ClassePrincipal.Pessoa;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToOne;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;
@Entity
@Data
@EqualsAndHashCode(callSuper = false)
public class Professor extends Pessoa implements Serializable {

}
