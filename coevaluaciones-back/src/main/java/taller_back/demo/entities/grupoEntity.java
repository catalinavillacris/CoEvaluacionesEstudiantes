package taller_back.demo.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class grupoEntity extends BaseEntity{

    private int numero;
    private String nombre;
    
}
