package taller_back.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class grupoEntity extends BaseEntity{

    private int numero;
    private String nombre;

    @PodamExclude
    @OneToMany(mappedBy = "nombre")
    private List<estudianteEntity> estudiantes= new ArrayList<>();
    
}
