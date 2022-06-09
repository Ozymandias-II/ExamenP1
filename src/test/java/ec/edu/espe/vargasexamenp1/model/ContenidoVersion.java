package ec.edu.espe.vargasexamenp1.model;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ContenidoVersion implements Serializable {

    private static  final long serialVersionUID = 12231564L;

    @Id
    @Column(name = "cod_contenido_version")
    private Integer pk;

    @Column(name = "hash_archivo")
    private String hashArchivo;

    @Column(name = "nombre_archivo")
    private String nombreArchivo;

    @Column(name = "tamanio")
    private Number tamanio;

    @Version
    @Column(name = "version")
    private Number version;

    @Column(name = "comentario")
    private String comentario;

    @Column(name = "fecha_creacion")
    private Date fechaCreacion;

    @Column(name = "cod_usuario_creacion")
    private Integer codUsuarioCreacion;

    @JoinColumn(name = "cod_contenido", referencedColumnName = "cod_contenido", nullable = false)
    @ManyToOne(optional = false)
    private Contenido contenido;

    public ContenidoVersion(Integer pk) {
        this.pk = pk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        ContenidoVersion that = (ContenidoVersion) o;
        return pk != null && Objects.equals(pk, that.pk);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
