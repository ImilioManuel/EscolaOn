package com.FI.EscolaOn.Repositories;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.DataDeNascimento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataNascimentoRepository extends JpaRepository<DataDeNascimento,Integer> {
}
