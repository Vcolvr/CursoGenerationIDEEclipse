package com.ExercicioLojaDeJogos.ExercicioDeLojaDeJogos.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Entity
public class Usuario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idUsuario;
	
	@Size(min = 5, max = 50, message = "Por favor, insira seu nome")
	private String nomeUsuario;
	
	@Size(min = 5, max = 50, message = "Por favor, insira um apelido para que saibamos como te chamar")
	private String apelido;
	
	@Size(min = 5, max = 50, message = "Por favor, se você utiliza um nome social, nos diga.")
	private String nomeSocial;
	
	@Size(min = 5, max = 50, message = "Sua senha deve ter mais que 5 caractéres!")
	private String senha;
	
	@Size(min = 5, max = 50, message = "Por favor, insira seu nome")
	private String email;
	
	@NotNull
	private String endereco;
	
	@OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("usuario")
	private List<Produto> produtosUsuario;

	public Usuario() {
	}

	public Usuario(Long idUsuario, String nomeUsuario, String apelido, String senha,
			String email, String endereco) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.apelido = apelido;
		this.senha = senha;
		this.email = email;
		this.endereco = endereco;
	}

	public Usuario(Long idUsuario, String nomeUsuario, String apelido, String nomeSocial, String senha, String email,
			String endereco) {
		this.idUsuario = idUsuario;
		this.nomeUsuario = nomeUsuario;
		this.apelido = apelido;
		this.nomeSocial = nomeSocial;
		this.senha = senha;
		this.email = email;
		this.endereco = endereco;
	}

	public Long getIdUsuario() {
		return idUsuario;
	}

	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeDoUsuario(String nomeDoUsuario) {
		this.nomeUsuario = nomeDoUsuario;
	}

	public String getApelido() {
		return apelido;
	}

	public void setApelido(String apelido) {
		this.apelido = apelido;
	}

	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public List<Produto> getProdutosUsuario() {
		return produtosUsuario;
	}

	public void setProdutosUsuario(List<Produto> produtosUsuario) {
		this.produtosUsuario = produtosUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
	}
	
}
