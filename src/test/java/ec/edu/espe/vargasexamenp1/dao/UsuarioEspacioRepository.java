package ec.edu.espe.vargasexamenp1.dao;

import ec.edu.espe.vargasexamenp1.model.UsuarioEspacio;
import ec.edu.espe.vargasexamenp1.model.UsuarioEspacioPk;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioEspacioRepository extends JpaRepository<UsuarioEspacio, UsuarioEspacioPk> {
}