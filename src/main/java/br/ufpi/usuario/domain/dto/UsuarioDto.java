package br.ufpi.usuario.domain.dto;

import br.ufpi.usuario.domain.enuns.SituacaoEnum;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioDto {
	private Long id;
	private String nome;
	private String cpf;
	private String email;
	private SituacaoEnum situacao;
}
