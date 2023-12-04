package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.dto.AlunoDTO;
import com.FI.EscolaOn.entity.Aluno;
import com.FI.EscolaOn.entity.Contacto;
import com.FI.EscolaOn.entity.DataDeNascimento;
import com.FI.EscolaOn.entity.Endereco;
import com.FI.EscolaOn.service.AlunoService;
import com.FI.EscolaOn.service.ContactoService;
import com.FI.EscolaOn.service.DataNascimentoService;
import com.FI.EscolaOn.service.EnderecoService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.time.ZoneId;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/Aluno")
public class AlunoController {
    @Autowired
    AlunoService alunoService;
    @Autowired
    EnderecoService enderecoService;

    @Autowired
    ContactoService contactoService;

    @Autowired
    DataNascimentoService dataNascimentoService;
    @PostMapping
    public ResponseEntity<Object> saveAluno(@RequestBody @Valid AlunoDTO alunoDTO){

        Aluno aluno;
        Endereco endereco;
        Contacto contacto;
        DataDeNascimento dataDeNascimento;

        endereco = new Endereco(alunoDTO.getProvincia(),alunoDTO.getMunicipio(),alunoDTO.getBairro());
        enderecoService.save(endereco);
        contacto = new Contacto(alunoDTO.getTelefone(),alunoDTO.getFixo(),alunoDTO.getEmail());
        contactoService.save(contacto);
        dataDeNascimento = new DataDeNascimento(alunoDTO.getDia(), alunoDTO.getMes(),alunoDTO.getAno());
        dataNascimentoService.save(dataDeNascimento);
        aluno = new Aluno(alunoDTO.getNomeCompleto(),
                dataDeNascimento, endereco, contacto,
                alunoDTO.getGenero(),alunoDTO.getSenha(),
                LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(alunoService.save(aluno));
    }


}
