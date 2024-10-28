package taller_back.demo.entities;

import java.sql.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class coevaluacionEntity extends BaseEntity{

    private String comentario;
    private java.util.Date fecha;
    private double calificacion;

    @PodamExclude
    @ManyToOne
    private estudianteEntity estudiante;
    
}
