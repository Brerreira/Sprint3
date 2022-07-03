package br.com.alura.forum.controller.dto;

import java.util.List;
import java.util.stream.Collectors;

import br.com.alura.forum.modelo.Logradouro;

public class LogradouroDto {

	private Long id;
	private String nome;
	private String regiao;
	private Long populacao;
	private String capital;
	private Double area;
	
	
	public LogradouroDto(Logradouro logradouro) {
		
		this.id = logradouro.getId();
		this.nome = logradouro.getNome();
		this.regiao = logradouro.getRegiao();
		this.populacao = logradouro.getPopuacao();
		this.capital = logradouro.getCapital();
		this.area = logradouro.getArea();
	}


	public static List<LogradouroDto> converter(List<Logradouro> logradouros) {
		
		return logradouros.stream().map(LogradouroDto::new).collect(Collectors.toList());
	}
	
}
