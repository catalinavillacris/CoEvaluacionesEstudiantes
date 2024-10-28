package taller_back.demo.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class estudianteEntity extends BaseEntity {

    private String login;
    private String nombre;
    
}
