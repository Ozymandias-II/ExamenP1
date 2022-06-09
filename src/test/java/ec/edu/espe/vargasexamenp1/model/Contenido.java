package ec.edu.espe.vargasexamenp1.model;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Contenido implements Serializable {

    private static  final long serialVersionUID = 12231564L;

    @Id
    @Column(name = "cod_contenido")
    private Integer pk;

    @Column(name = "tipo_contenido")
    private Number tipoContenido;

    @Column(name = "nombre")
    private String nombre;

    @Column(name = "nombre_archivo")
    private String nombreArchivo;

    @Column(name = "estado")
    private Integer estado;

    @Version
    @Column(name = "version")
    private Number version;

    @JoinColumn(name = "cod_espacio", referencedColumnName = "cod_espacio", nullable = false)
    @ManyToOne(optional = false)
    private Espacio espacio;

    @OneToMany( cascade = CascadeType.ALL ,mappedBy = "contenido")
    @ToString.Exclude
    private List<ContenidoVersion> contenidoVersiones;

    @JoinColumn(name = "cod_contenido_padre", referencedColumnName = "cod_contenido", nullable = true)
    @ManyToOne(optional = true)
    private Contenido contenido;


    public Contenido(Integer pk) {
        this.pk = pk;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Contenido contenido = (Contenido) o;
        return pk != null && Objects.equals(pk, contenido.pk);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
