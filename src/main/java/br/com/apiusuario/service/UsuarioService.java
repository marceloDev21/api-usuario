package br.com.apiusuario.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.apiusuario.model.Usuario;
import br.com.apiusuario.repository.UsuarioRepository;


@Service
public class UsuarioService {

	@Autowired
    private UsuarioRepository usuarioRepository;

    public List<Usuario> obterTodos() {
        
        return usuarioRepository.findAll();
    }

    public Optional<Usuario> obterPorId(Long id) {

        return usuarioRepository.findById(id);

    }
  

    public Usuario adicionar(Usuario usuario) {

    	usuario.setId(null);
        return usuarioRepository.save(usuario);

    }

    public void deletar(Long id) {
    	usuarioRepository.deleteById(id);
    }

    public Usuario atualizar(Long id, Usuario usuario) {
   
    	usuario.setId(id);
        return usuarioRepository.save(usuario);

    }
	
}
