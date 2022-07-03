package br.com.alura.forum.modelo;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@Entity
public class Logradouro {

	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String regiao;
	private Long populacao;
	private String capital;
	private Double area;
	
	
	public Logradouro(Long id, String nome, String regiao, Long populacao, String capital, double area) {
		super();
		this.id = id;
		this.nome = nome;
		this.regiao = regiao;
		this.populacao = populacao;
		this.capital = capital;
		this.area = area;
	}
	
	
	public Logradouro(int i, String nome2, String regiao2, int j, String capital2, double area2) {
		// TODO Auto-generated constructor stub
	}


	@Override
	public int hashCode() {
		return Objects.hash(area, capital, id, nome, populacao, regiao);
		
		
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Logradouro other = (Logradouro) obj;
		return Objects.equals(area, other.area) && Objects.equals(capital, other.capital)
				&& Objects.equals(id, other.id) && Objects.equals(nome, other.nome)
				&& Objects.equals(populacao, other.populacao) && Objects.equals(regiao, other.regiao);
		
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRegiao() {
		return regiao;
	}
	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}
	public Long getPopuacao() {
		return populacao;
	}
	public void setPopuacao(Long popuacao) {
		this.populacao = popuacao;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public Double getArea() {
		return area;
	}
	public void setArea(Double area) {
		this.area = area;
	}
	
	
	
	
	
	
}
