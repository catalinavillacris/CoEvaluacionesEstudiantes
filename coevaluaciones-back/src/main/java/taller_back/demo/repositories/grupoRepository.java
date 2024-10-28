package taller_back.demo.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import taller_back.demo.entities.grupoEntity;

public interface grupoRepository extends JpaRepository<Long,grupoEntity> {
    List<grupoEntity> finfindByNombre(String nombre);
}
