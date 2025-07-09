package br.ufpi.usuario.domain;

import java.time.LocalDate;
import java.util.Set;

import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Usuario extends GenericModel{
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private LocalDate dataAdesao;
	private Situacao situacaoAtual;
	@OneToMany
	private Set<Situacao> situacoes;
}
