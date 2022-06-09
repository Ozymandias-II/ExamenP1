package ec.edu.espe.vargasexamenp1.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Espacio implements Serializable {

    private static  final long serialVersionUID = 12231564L;

    @Id
    @Column(name = "cod_espacio")
    private Integer pk;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;


    public Espacio(Integer pk) {
        this.pk = pk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Espacio espacio = (Espacio) o;
        return pk != null && Objects.equals(pk, espacio.pk);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
