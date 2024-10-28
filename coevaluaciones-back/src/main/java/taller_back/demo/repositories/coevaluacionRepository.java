package taller_back.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import taller_back.demo.entities.coevaluacionEntity;

public interface coevaluacionRepository extends JpaRepository<Long,coevaluacionEntity> {
    
}
