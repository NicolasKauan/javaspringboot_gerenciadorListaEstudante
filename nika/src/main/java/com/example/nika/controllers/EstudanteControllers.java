package com.example.nika.controllers;

import com.example.nika.models.EstudanteModel;
import com.example.nika.services.EstudanteServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<EstudanteModel> buscarTodosEstudantes(){
        return estudanteServices.findAll();
    }

    @DeleteMapping("/{id}")
    public void deletarEstudante(@PathVariable Long id){
        estudanteServices.deletarEstudante(id);
    }

}
