package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.dto.AlunoDTO;
import com.FI.EscolaOn.entity.*;
import com.FI.EscolaOn.service.*;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;
    @Autowired
    AlunoCursoService alunoCursoService;
    @Autowired
    EnderecoService enderecoService;

    @Autowired
    ContactoService contactoService;

    @Autowired
    CursoService cursoService;
    @Autowired
    DataNascimentoService dataNascimentoService;
    @PostMapping
    public ResponseEntity<Object> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO){
        Aluno aluno;
        aluno = new Aluno(
                alunoDTO.getNomeCompleto(),
                dataNascimentoService.save(new DataDeNascimento(alunoDTO.getDia(), alunoDTO.getMes(),alunoDTO.getAno())),
                enderecoService.save(new Endereco(alunoDTO.getProvincia(),alunoDTO.getMunicipio(),alunoDTO.getBairro())),
                contactoService.save(new Contacto(alunoDTO.getTelefone(),alunoDTO.getFixo(),alunoDTO.getEmail())),
                alunoDTO.getGenero(),
                alunoDTO.getSenha(),
                LocalDateTime.now(ZoneId.of("UTC")));
        Aluno alunoRetorno = (Aluno) alunoService.save(aluno);
        if (alunoRetorno == null) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Cadastro Falhado!");
        }
        alunoCursoService.save(new AlunoCurso(cursoService.findById(alunoDTO.getCursoId()),aluno));
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoRetorno);
    }
}
