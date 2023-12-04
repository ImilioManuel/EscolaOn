package com.FI.EscolaOn.Repositories;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Endereco;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends JpaRepository<Endereco,Integer> {
}
