package repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.exemplo.cadastro.SistemaDeCadastro.model.Usuario;

public interface UsuarioRepository extends  JpaRepository  <Usuario , Long> {

	

}
