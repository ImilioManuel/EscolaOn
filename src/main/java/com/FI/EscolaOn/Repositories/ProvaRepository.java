package com.FI.EscolaOn.Repositories;

import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Prova;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvaRepository extends JpaRepository<Prova,Integer> {
}
