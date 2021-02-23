package com.exercicioFarmacia.ExercicioFarmaciaCarvalho.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idCategoria;
	
	@NotNull(message = "Por favor, informe seu produto.")
	private String nomeProduto;
	
	@NotNull(message = "Por favor, informe o preço do produto.")
	private Double preço;
	
	@NotNull(message = "Uma descrição é importante para obter confiança em seu produto. Que tal descrevê-lo?")
	@Size(min = 20 , max = 500)
	private String descrição;
	
	@ManyToOne
	@JsonIgnoreProperties("produtos")
	private Categoria categoria;

	public Produto() {
	}

	public Produto(Long idCategoria, String nomeProduto, Double preço, String descrição) {
		this.idCategoria = idCategoria;
		this.nomeProduto = nomeProduto;
		this.preço = preço;
		this.descrição = descrição;
	}

	public Long getIdCategoria() {
		return idCategoria;
	}

	public void setIdCategoria(Long idCategoria) {
		this.idCategoria = idCategoria;
	}

	public String getNomeProduto() {
		return nomeProduto;
	}

	public void setNomeProduto(String nomeProduto) {
		this.nomeProduto = nomeProduto;
	}

	public Double getPreço() {
		return preço;
	}

	public void setPreço(Double preço) {
		this.preço = preço;
	}

	public String getDescrição() {
		return descrição;
	}

	public void setDescrição(String descrição) {
		this.descrição = descrição;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
