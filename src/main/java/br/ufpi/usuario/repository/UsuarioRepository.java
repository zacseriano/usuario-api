package br.ufpi.usuario.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.ufpi.usuario.domain.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
