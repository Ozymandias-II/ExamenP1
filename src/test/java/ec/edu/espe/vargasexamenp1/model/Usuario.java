package ec.edu.espe.vargasexamenp1.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@NoArgsConstructor
@Entity
@ToString
public class Usuario implements Serializable {
    private static  final long serialVersionUID = 12231564L;

    @Id
    @Column(name = "cod_usuario")
    private Integer pk;

    @Column(name = "username")
    private String nUsuario;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "estado")
    private String estado;

    @Column(name = "clave")
    private String clave;

    public Usuario(Integer pk) {
        this.pk = pk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Usuario usuario = (Usuario) o;
        return pk != null && Objects.equals(pk, usuario.pk);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
