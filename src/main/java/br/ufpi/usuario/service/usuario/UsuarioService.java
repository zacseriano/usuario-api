package br.ufpi.usuario.service.usuario;

import br.ufpi.usuario.domain.dto.UsuarioDto;
import br.ufpi.usuario.domain.form.UsuarioForm;

public interface UsuarioService {
	UsuarioDto visualizar(Long id);
	UsuarioDto criar(UsuarioForm form);
	UsuarioDto modificar(Long id, UsuarioForm form);
	void deletar(Long id);
}
