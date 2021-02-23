package com.exercicioFarmacia.ExercicioFarmaciaCarvalho.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exercicioFarmacia.ExercicioFarmaciaCarvalho.model.Categoria;

@Repository

public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

	public List <Categoria> findAllByDepartamentoContainingIgnoreCase (String departamento);
}
