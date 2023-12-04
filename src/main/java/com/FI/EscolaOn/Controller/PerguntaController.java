package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.Repositories.PerguntaRepository;
import com.FI.EscolaOn.dto.AlunoDTO;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.DataDeNascimento;
import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.service.AlunoService;
import com.FI.EscolaOn.service.PerguntaService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Aluno")
public class PerguntaController {
    @Autowired
    PerguntaService perguntaService;
}
