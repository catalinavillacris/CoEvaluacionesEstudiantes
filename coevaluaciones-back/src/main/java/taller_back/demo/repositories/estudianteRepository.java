package taller_back.demo.repositories;

import java.util.List;

import org.springframework.stereotype.Repository;

import taller_back.demo.entities.estudianteEntity;

@Repository
/**
 * estudianteRepository
 */
public interface estudianteRepository {

    


    List<estudianteEntity> findByNombre(String nombre);
    
}
