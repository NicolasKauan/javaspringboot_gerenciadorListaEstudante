package com.example.nika.services;


import com.example.nika.models.EstudanteModel;
import com.example.nika.repositories.EstudanteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EstudanteServices {

    @Autowired
    private EstudanteRepository estudanteRepository;

    public EstudanteModel criarEstudante(EstudanteModel estudanteModel){
        return estudanteRepository.save(estudanteModel);
    }

    public List<EstudanteModel> findAll(){
        return estudanteRepository.findAll();
    }

    public void deletarEstudante(Long id){
        estudanteRepository.deleteById(id);
    }

    public Optional<EstudanteModel> buscarPorId(Long id){
        return estudanteRepository.findById(id);
    }

    public  EstudanteModel atualizar(Long id, EstudanteModel estudanteModel){
        EstudanteModel model = estudanteRepository.findById(id).get();
        model.setNome(estudanteModel.getNome());
        model.setEmail(estudanteModel.getEmail());
        model.setIdade(estudanteModel.getIdade());
        return  estudanteRepository.save(model);
    }

}
