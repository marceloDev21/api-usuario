package br.com.apiusuario.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.apiusuario.model.Usuario;
import br.com.apiusuario.service.UsuarioService;


@RestController
@RequestMapping("/api/usuario")
public class UsuarioController {

	@Autowired
	private UsuarioService usuarioService;

	
	@GetMapping
	public List<Usuario> obterTodos() {
		return usuarioService.obterTodos();
	}

	
	@GetMapping("/{id}")
	public Optional<Usuario> obterporId(@PathVariable Long id) {
		return usuarioService.obterPorId(id);
	}

	
	
	@PostMapping
	public Usuario adicionar(@RequestBody Usuario usuario) {
		return usuarioService.adicionar(usuario);

	}

	
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deletar(@PathVariable Long id) {
		usuarioService.deletar(id);
	}


	@PutMapping("/{id}")
	public Usuario atualizar(@PathVariable Long id, @RequestBody Usuario usuario) {
		return usuarioService.atualizar(id, usuario);

	}
	
}
