package com.ExercicioLojaDeJogos.ExercicioDeLojaDeJogos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Categoria {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Size(min = 4, max = 20, message = "Sua senha deve ter entre 4 e 20 caractéres")
	private String genero;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<Produto> produtosCategoria;
	
	public Categoria() {
	}

	public Categoria(Long id, String genero) {
		this.id = id;
		this.genero = genero;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public List<Produto> getProdutosCategoria() {
		return produtosCategoria;
	}

	public void setProdutosCategoria(List<Produto> produtosCategoria) {
		this.produtosCategoria = produtosCategoria;
	}
	
	
}
