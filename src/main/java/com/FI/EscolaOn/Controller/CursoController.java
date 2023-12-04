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
import java.util.List;
import java.util.Optional;

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

    @GetMapping
    public ResponseEntity<List<Curso>> getAllCurso( ){
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.findAll());
    }
    @GetMapping("/{id}")
    public ResponseEntity<Object> getOneParkingSpot(@PathVariable(value = "id") Integer id){
        Optional<Curso> cursoOptional = cursoService.findById(id);
        if (!cursoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso not found.");
        }
        return ResponseEntity.status(HttpStatus.OK).body(cursoOptional.get());
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteParkingSpot(@PathVariable(value = "id") Integer id){
        Optional<Curso> cursoOptional = cursoService.findById(id);
        if (!cursoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso not found.");
        }
        cursoService.delete(cursoOptional.get());
        return ResponseEntity.status(HttpStatus.OK).body("Parking Spot deleted successfully.");
    }
    @PutMapping("/{id}")
    public ResponseEntity<Object> updateCurso(@PathVariable(value = "id") Integer id,
                                                    @RequestBody @Valid CursoDTO cursoDTO){
        Optional<Curso> cursoOptional = cursoService.findById(id);
        if (!cursoOptional.isPresent()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Curso not found.");
        }
        var curso = new Curso();
        BeanUtils.copyProperties(cursoDTO, curso);
        curso.setId(cursoOptional.get().getId());
        curso.setDataCadastro(cursoOptional.get().getDataCadastro());
        return ResponseEntity.status(HttpStatus.OK).body(cursoService.save(curso));
    }

}
