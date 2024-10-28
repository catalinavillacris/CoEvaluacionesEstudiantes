package taller_back.demo.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;
import uk.co.jemos.podam.common.PodamExclude;

@Data
@Entity
public class estudianteEntity extends BaseEntity {

    private String login;
    private String nombre;

    @PodamExclude
    @ManyToOne
    private grupoEntity grupo;
    
    @PodamExclude
    @OneToMany (mappedBy = "nombre")
    private List<coevaluacionEntity> evaluacionesHechas= new ArrayList<>();

    @PodamExclude
    @ManyToMany
    @OneToMany (mappedBy = "nombre")
    private List<coevaluacionEntity> evaluacionesRecibidas= new ArrayList<>();
}
