package br.ufpi.usuario.domain.form;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UsuarioForm {
	private String nome;
	private String cpf;
	private String email;
	private String senha;
}
