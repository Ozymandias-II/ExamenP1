package ec.edu.espe.vargasexamenp1.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class UsuarioEspacio implements Serializable {

    private static  final long serialVersionUID = 12231564L;

    @EmbeddedId
    private UsuarioEspacioPk pk;

    @Column(name = "estado")
    private String estado;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_usario")
    private Usuario usuario;

    @ManyToOne(optional = false)
    @JoinColumn(name = "cod_espacio")
    private Espacio espacio;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        UsuarioEspacio that = (UsuarioEspacio) o;
        return pk != null && Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pk);
    }
}
