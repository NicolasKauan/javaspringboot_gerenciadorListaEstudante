package com.example.nika.controllers;

import com.example.nika.models.EstudanteModel;
import com.example.nika.services.EstudanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(path ="/estudantes")
public class EstudanteControllers {

    @Autowired
    private EstudanteServices estudanteServices;

    @PostMapping
    public EstudanteModel criarEstudante(@RequestBody EstudanteModel estudanteModel){
        return estudanteServices.criarEstudante(estudanteModel);
    }

    @GetMapping
    public ResponseEntity<List<EstudanteModel>> findAll(){

        List<EstudanteModel> request = estudanteServices.findAll();

        return ResponseEntity.ok().body(request);
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteServices.deletarEstudante(id);
    }

    @GetMapping("/{id}")
    public Optional<EstudanteModel> buscarPorId(Long id){
        return estudanteServices.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public  EstudanteModel atualizar(@PathVariable Long id,@RequestBody EstudanteModel estudanteModel){
        return  estudanteServices.atualizar(id, estudanteModel);
    }

}
