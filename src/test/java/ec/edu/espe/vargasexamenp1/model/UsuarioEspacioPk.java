package ec.edu.espe.vargasexamenp1.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
@Embeddable
@Data

public class UsuarioEspacioPk implements Serializable {

    private static final long serialVersionUID = -857335L;

    @Column(name = "cod_usuario", nullable = false)
    private Integer codUsuario;

    @Column(name = "cod_espacio", nullable = false)
    private Integer codEspacio;
}
