package ec.edu.espe.vargasexamenp1.dao;

import ec.edu.espe.vargasexamenp1.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}