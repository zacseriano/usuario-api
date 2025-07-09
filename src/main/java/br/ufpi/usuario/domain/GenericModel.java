package br.ufpi.usuario.domain;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class GenericModel {
	private Long id;
	private LocalDate dataCriacao;
	private LocalDate dataAtualizacao;
}
