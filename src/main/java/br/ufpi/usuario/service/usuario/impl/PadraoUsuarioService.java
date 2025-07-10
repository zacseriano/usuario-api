package br.ufpi.usuario.service.usuario.impl;

import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpi.usuario.domain.dto.UsuarioDto;
import br.ufpi.usuario.domain.enuns.SituacaoEnum;
import br.ufpi.usuario.domain.form.UsuarioForm;
import br.ufpi.usuario.domain.mapper.UsuarioMapper;
import br.ufpi.usuario.domain.model.Usuario;
import br.ufpi.usuario.repository.UsuarioRepository;
import br.ufpi.usuario.service.usuario.UsuarioService;

@Service
public class PadraoUsuarioService implements UsuarioService {
	
	@Autowired
	private UsuarioRepository repository;
	@Autowired
	private UsuarioMapper mapper;
	
	@Override
	public UsuarioDto visualizar(Long id) {
		return mapper.toDto(buscarUsuario(id));
	}
	
	@Override
	public UsuarioDto criar(UsuarioForm form) {
		Usuario usuario = mapper.toModel(form);
		usuario.setSituacao(SituacaoEnum.ATIVO);
		repository.save(usuario);
		return null;
	}
	
	@Override
	public UsuarioDto modificar(Long id, UsuarioForm form) {
		Usuario usuario = buscarUsuario(id);
		BeanUtils.copyProperties(form, usuario);
		return mapper.toDto(repository.save(usuario));
	}
	
	@Override
	public void deletar(Long id) {
		Usuario usuario = buscarUsuario(id);
		repository.delete(usuario);
	}
	
	private Usuario buscarUsuario(Long id) {
		Optional<Usuario> optUsuario = repository.findById(id);
		if(optUsuario.isPresent()) {
			return optUsuario.get();
		} else {
			throw new RuntimeException(String.format("Não existe o Usuário com o ID %d", id));
		}
	}

}
