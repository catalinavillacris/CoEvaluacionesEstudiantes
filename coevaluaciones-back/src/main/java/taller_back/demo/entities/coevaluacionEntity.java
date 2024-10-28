package taller_back.demo.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class coevaluacionEntity extends BaseEntity{

    private String comentario;
    private java.util.Date fecha;
    private double calificacion;
    
}
