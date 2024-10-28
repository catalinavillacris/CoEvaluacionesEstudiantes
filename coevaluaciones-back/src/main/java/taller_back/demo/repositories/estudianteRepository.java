package taller_back.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import taller_back.demo.entities.estudianteEntity;

@Repository
/**
 * estudianteRepository
 */
public interface EstudianteRepository extends JpaRepository<estudianteEntity, Long> {

    


    List<estudianteEntity> findByNombre(String nombre);
    
}
