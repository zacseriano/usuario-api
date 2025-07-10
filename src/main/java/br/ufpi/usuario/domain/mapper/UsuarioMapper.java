package br.ufpi.usuario.domain.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import br.ufpi.usuario.domain.dto.UsuarioDto;
import br.ufpi.usuario.domain.form.UsuarioForm;
import br.ufpi.usuario.domain.model.Usuario;

@Mapper(componentModel = "spring")
public interface UsuarioMapper extends EntityMapper<UsuarioDto, Usuario, UsuarioForm>{
	UsuarioDto toDto(Usuario entity);
	@Mappings({
		@Mapping(target = "dataAdesao", ignore = true),
		@Mapping(target = "situacao", ignore = true)
	})
	Usuario toModel(UsuarioForm form);
}
