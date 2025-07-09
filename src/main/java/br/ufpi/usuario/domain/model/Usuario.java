package br.ufpi.usuario.domain.model;

import java.time.LocalDate;

import br.ufpi.usuario.domain.enuns.SituacaoEnum;
import jakarta.persistence.Entity;
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
@Entity
public class Usuario extends GenericModel {
	private String nome;
	private String cpf;
	private String email;
	private String senha;
	private LocalDate dataAdesao;
	private SituacaoEnum situacao;
}
