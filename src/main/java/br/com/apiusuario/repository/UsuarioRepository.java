package br.com.apiusuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.apiusuario.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

}
