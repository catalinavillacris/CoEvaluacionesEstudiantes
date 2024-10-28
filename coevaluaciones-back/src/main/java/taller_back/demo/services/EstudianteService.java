package taller_back.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import taller_back.demo.entities.estudianteEntity;
import taller_back.demo.repositories.EstudianteRepository;


@Slf4j
@Service
public class EstudianteService {
    
    @Autowired
    private EstudianteRepository estudianteRepository;


    @Transactional
    public estudianteEntity createEstudiante(estudianteEntity estudiante){
        log.info("Creando estudiante");
        return estudianteRepository.save(estudiante);
    }

    @Transactional
    public List<estudianteEntity> getEstudiantes(){
        log.info("Consultando estudiantes");
        return estudianteRepository.findAll();
    };

    @Transactional
    public estudianteEntity getEstudiante(Long estudianteId){
        log.info("Consultando estudiante con id = "+estudianteId);
        return estudianteRepository.findById(estudianteId).get();
    }
    

    
    


    
    
}
