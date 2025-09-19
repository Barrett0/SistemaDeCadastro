package controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.exemplo.cadastro.SistemaDeCadastro.model.Usuario;

import repository.UsuarioRepository;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

	private final UsuarioRepository repository;
	
  public UsuarioController	(UsuarioRepository repository) {
	  this.repository = repository;
	}
  
  @GetMapping
  public List <Usuario> listar() {
	  return repository.findAll();
  }
  
  @PostMapping
	public Usuario salvar (@RequestBody Usuario usuario) {
		return repository.save(usuario);        
	}
  
  @GetMapping ("/{id}")
  public Usuario buscar (@PathVariable Long id) {
	  return repository.findById(id).orElse(null);
			  
  }
  @PutMapping ("/{id}")
  public Usuario atualizar (@PathVariable Long id, @RequestBody Usuario usuario) {
	  usuario.setId(id);
	  return repository.save(usuario);
  }
  @DeleteMapping ("/{id}")
  public void deletar (@PathVariable Long id) {
	  repository.deleteById(id);
  }
}
