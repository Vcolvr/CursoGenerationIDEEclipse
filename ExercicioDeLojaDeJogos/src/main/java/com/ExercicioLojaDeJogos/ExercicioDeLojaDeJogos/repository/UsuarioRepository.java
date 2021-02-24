package com.ExercicioLojaDeJogos.ExercicioDeLojaDeJogos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ExercicioLojaDeJogos.ExercicioDeLojaDeJogos.model.Usuario;

@Repository

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public List<Usuario> findAllByNomeUsuarioContainingIgnoreCase (String nomeDoUsuario);	
	
}
