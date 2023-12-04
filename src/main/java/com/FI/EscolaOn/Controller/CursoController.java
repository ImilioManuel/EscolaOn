package com.FI.EscolaOn.Controller;

import com.FI.EscolaOn.dto.CursoDTO;
import com.FI.EscolaOn.entity.Curso;
import com.FI.EscolaOn.service.CursoService;
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
@RequestMapping("/Curso")
public class CursoController {
    @Autowired
    CursoService cursoService;
    @PostMapping
    public ResponseEntity<Object> saveCurso(@RequestBody @Valid CursoDTO cursoDTO){
        var curso = new Curso();
        BeanUtils.copyProperties(cursoDTO,curso);
        curso.setDataCadastro(LocalDateTime.now(ZoneId.of("UTC")));
        return ResponseEntity.status(HttpStatus.CREATED).body(cursoService.save(curso));
    }
}
